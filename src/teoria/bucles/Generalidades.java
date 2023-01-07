package teoria.bucles;

import java.util.Arrays;

public class Generalidades {
    public static void main(String[] args) {
        final int NUMERO = 9;
       // NUMERO = 12;
        final int[] NUMEROS = {1, 2, 3};
        NUMEROS[0] = 10;
       /* int[] NUMEROS1 = {0, 0, 0};
        NUMEROS = NUMEROS1;*/
        System.out.println(Arrays.toString(NUMEROS));
    }
}
