package problemaB;

public class Porta {
    private double altura;
    private String cor;

    public Porta() {

    }

    public Porta(double altura, String cor){
        this.altura = altura;
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
