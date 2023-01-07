package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Colecciones1 {
    public static void main(String[] args) {
        Random random = new Random();
        final int TAMANNO = 12;
        //declaramos un array de enteros de tamaño 12
        int[] enteros = new int[TAMANNO];
        //cambiamos las posiciones a valores de enteros aleatorias
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = random.nextInt();
        }
        //mostramos datos
        System.out.println(Arrays.toString(enteros));
        //Asigna el valor 5 al  último elemento
        enteros[enteros.length - 1] = 5;
        System.out.println(Arrays.toString(enteros));
        //Cambiamos para que sean 3, 6, ..., 5
        for (int i = 0; i < enteros.length - 1; i++) {
            enteros[i] = i * 3 + 3;
        }
        System.out.println(Arrays.toString(enteros));
        //Cambia el valor del array y divide por 3 todos los  último 5 valores
        for (int i = enteros.length - 5; i < enteros.length; i++) {
            enteros[i] = enteros[i] / 3;
        }
        System.out.println(Arrays.toString(enteros));
        //mostrar la suma de los elementos
        int suma = sumarElementosArray(enteros);
        System.out.printf("La suma de los elementos del array vale %d%n", suma);
        //mostramos el elemento mas chico
        int menorValor = devolverMenorValor(enteros);
        System.out.printf("El menor valor del array es %d%n", menorValor);
        mostrarDatosFormateados4Columnas(enteros);
    }

    private static void mostrarDatosFormateados4Columnas(int[] enteros) {
        int contador = 1;
        for (int entero: enteros) {
            System.out.printf("%-5d", entero);
            if (contador % 4 == 0)
                System.out.println();
            contador++;
        }
    }

    private static int devolverMenorValor(int[] enteros) {
        int valorChico = Integer.MAX_VALUE;
        for (int entero : enteros) {
            if (entero < valorChico)
                valorChico = entero;
        }
        return valorChico;
    }

    private static int sumarElementosArray(int[] datos) {
        int suma = 0;
        /*for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }*/
        for (int dato : datos) {
            suma += dato;
        }
        return suma;
    }
}
