public class ContaBancariaSimplificada {
    private String titular;
    private double saldo;

    public ContaBancariaSimplificada(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean retira(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Saldo: R$" + saldo;
    }

    public static boolean transfere(ContaBancariaSimplificada origem, ContaBancariaSimplificada destino, double valor) {
        if (origem.retira(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
