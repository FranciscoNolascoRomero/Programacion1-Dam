package teoria.bucles;

import java.util.Random;

public class Bucles1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosEnteros1 = new int[30];
        //inicializamos datos de forma aleatoria
        for (int i = 0; i < numerosEnteros1.length; i++) {
            numerosEnteros1[i] = random.nextInt(10);
        }
        //System.out.println(numerosEnteros1);
        for (int i = 0; i < numerosEnteros1.length; i++) {
            System.out.printf("Elemento %d: %d%n", i, numerosEnteros1[i]);
        }
        System.out.println("=========================================");
        int[] numerosEnteros2 = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < numerosEnteros2.length; i++) {
            System.out.printf("Elemento %d: %d%n", i, numerosEnteros2[i]);
        }
        //System.out.println(numerosEnteros2[10]);
        //System.out.println(numerosEnteros2[numerosEnteros2.length]);
        System.out.println("Último elemento: " + numerosEnteros2[numerosEnteros2.length - 1]);

    }
}
