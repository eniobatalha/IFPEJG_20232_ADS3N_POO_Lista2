package problemaA;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(3.0, 4.0);
        Retangulo r2 = new Retangulo(100.0, 250.0);
        r2.setBase(75.00);
        r1.dobrarAltura();
        System.out.println(r1.imprimirArea());
        System.out.println(r2.imprimirArea());
        r1.inverterLados();
        r1.setBase(r2.getAltura());
        System.out.println(r1.imprimirArea());
        System.out.println(r2.imprimirArea());
    }
}