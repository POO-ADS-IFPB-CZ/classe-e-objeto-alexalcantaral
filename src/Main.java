import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("João", 1000);
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Maria", 500);

        System.out.println("Contas antes da transferência:");
        System.out.println(conta1);
        System.out.println(conta2);

        System.out.print("Informe o valor da tranferência: ");
        double valorTransferencia = sc.nextDouble();
        boolean sucesso = ContaBancariaSimplificada.transfere(conta1, conta2, valorTransferencia);

        System.out.println("\nTentativa de transferência de R$" + valorTransferencia);
        if (sucesso) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente.");
        }

        System.out.println("\nContas após a transferência:");
        System.out.println(conta1);
        System.out.println(conta2);
    }
}