package problemaA;

public class Retangulo {
    private double altura;
    private double base;

    public Retangulo() {
    }

    public Retangulo(double valor1, double valor2) {
        this.altura = valor1;
        this.base = valor2;
    }

    public Retangulo(double valor1) {
        this.altura = valor1;
        this.base = valor1;
    }

    public String imprimirArea(){
        double altura = this.getAltura();
        double base = this.getBase();
        double area = base * altura;
        return String.format("A área do retângulo é %.2f" , area);
    }

    public void dobrarAltura () {
        this.altura = this.getAltura() * 2.0;
    }

    public void inverterLados(){
        double altura = this.getAltura();
        double base = this.getBase();
        this.setAltura(base);
        this.setBase(altura);
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

}
