package teoria.arrayBidimensionales;

import java.util.Arrays;

public class Ejemplo2 {
    public static void main(String[] args) {
        /* 0,  1, 2
           3,  4, 5
           6,  7, 8
           9, 10, 11
         */
        //int[][] array = new int[4][3]
        //luego a rellenar
        //declarando e inicializando sería:
        int[][] array = {
                            {0,  1,  2},
                            {3,  4,  5},
                            {6,  7,  8},
                            {9, 10, 11}
                        };
        System.out.println(array);  //mostrará [[I
        System.out.println(Arrays.toString(array)); //[[I..., [I..., ...]
        System.out.println(array[1]); //mostrará [I
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int[][] array1 = {
                            {0, 1},
                            {2, 3, 4},
                            {-9, 9, 0, 12, 1}
                        };
        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
    }
}
