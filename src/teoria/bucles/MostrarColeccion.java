package teoria.bucles;

import java.util.Arrays;

public class MostrarColeccion {
    public static void main(String[] args) {
        String[] cadenas = {"hola", "  ", "mundo"};
        //mostrando datos usando bucle fori
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }
        System.out.println("=====================");
        //mostrando datos usando bucle foreach
        for (String cadena: cadenas) {
            System.out.println(cadena);
        }
        System.out.println("=====================");
        //usando la clase Arrays
        System.out.println(cadenas);
        System.out.println(Arrays.toString(cadenas));

    }
}
