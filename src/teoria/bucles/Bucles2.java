package teoria.bucles;

public class Bucles2 {
    public static void main(String[] args) {
        float[] numerosFloat = {1, 2.3F, 3.7f, 4};
        //recorremos forma clásica con bucle fori
        for (int i = 0; i < numerosFloat.length; i++) {
            System.out.printf("%d: %.2f%n", i, numerosFloat[i]);
        }
        System.out.println("============================");
        //recorremos usando un foreach
        for (float numero: numerosFloat) {
            System.out.printf("%.2f%n", numero);
        }
    }
}
