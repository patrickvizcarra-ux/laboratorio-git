public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Operaciones disponibles: suma");

        int a = 10;
        int b = 5;

        System.out.println("Suma: " + sumar(a, b));
    }
}