//Questão 4.
package entities;

public class Lampada {

    private String codigoProduto, marca, corLuz;
    private int estoqueDisponivel, vidaUtil;
    private float potencia, peso;

    public Lampada(String codigoProduto, String marca, String corLuz, int estoqueDisponivel,
                   int vidaUtil, float potencia, float peso) {
        this.codigoProduto = codigoProduto;
        this.marca = marca;
        this.corLuz = corLuz;
        this.estoqueDisponivel = estoqueDisponivel;
        this.vidaUtil = vidaUtil;
        this.potencia = potencia;
        this.peso = peso;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCorLuz() {
        return corLuz;
    }

    public void setCorLuz(String corLuz) {
        this.corLuz = corLuz;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}