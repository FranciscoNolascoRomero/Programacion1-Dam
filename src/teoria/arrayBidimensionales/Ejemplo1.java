package teoria.arrayBidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo1 {
    public static void main(String[] args) {
        Random random = new Random();
       /* int[] array0 = new int[4];
        System.out.println("llenos de 0s\t" + Arrays.toString(array0));
        Arrays.fill(array0, 7);
        System.out.println("llenos de 7s\t" + Arrays.toString(array0));
        for (int i = 0; i < array0.length; i++) {
            array0[i] = 8;
        }
        System.out.println("llenos de 8s\t" + Arrays.toString(array0));
        for (int numero : array0) {
            numero = 9;
        }
        System.out.println("llenos de 9s\t" + Arrays.toString(array0));*/


        int[][] array1 = new int[3][4];
        mostrarDatosArrayBidimensional(array1);
        //Usando el método fill de la clase Arrays, llenamos de 7s
        for (int i = 0; i < array1.length; i++) {
            Arrays.fill(array1[i], 7);
        }
        mostrarDatosArrayBidimensional(array1);
        //Usando la clase Random, nos genere un aleatorio entre 0 y 9 inclusive
        //rellenamos los datos, no se usa la clase Arrays
        int numeroAleatorio =  random.nextInt(10);
        System.out.printf("Nº aleatorio %d%n", numeroAleatorio);
        array1[0][0] = random.nextInt(10);
        array1[0][1] = random.nextInt(10);
        array1[0][2] = random.nextInt(10);
        array1[0][3] = random.nextInt(10);
        array1[1][0] = random.nextInt(10);
        array1[1][1] = random.nextInt(10);
        array1[1][2] = random.nextInt(10);
        array1[1][3] = random.nextInt(10);
        array1[2][0] = random.nextInt(10);
        array1[2][1] = random.nextInt(10);
        array1[2][2] = random.nextInt(10);
        array1[2][3] = random.nextInt(10);
        mostrarDatosArrayBidimensional(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = random.nextInt(10);
            }
        }
        mostrarDatosArrayBidimensional(array1);

    }
    private static void mostrarDatosArrayBidimensional(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
