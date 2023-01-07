package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //trrabajmos con List, porque no sabemos el nº de primos que va a haber
        //si trabajamos con array, debemos definir el tamaño, al desconocerlo
        //nos complicaría bastante el ejercicio
        List<Integer> listaNPrimos = new ArrayList<>();
        //No aceptamos negativos, por especificaciones del programa
        // ni cero, ni el uno según las matemáticas no pueden ser números primos
        int numeroMenor = obtenerNumeroCorrecto();
        int numeroMayor = obtenerNumeroCorrecto();
       // scanner.close();
        if (numeroMenor > numeroMayor) {
            int temp = numeroMayor;
            numeroMayor = numeroMenor;
            numeroMenor = temp;
        }
        System.out.printf("Menor %d, mayor %d, %n", numeroMenor, numeroMayor);
        for (int i = numeroMenor; i <= numeroMayor ; i++) {
           // System.out.printf("¿Es primo %d? %b %n", i, esPrimo(i));
            if (esPrimo(i))
                listaNPrimos.add(i);
        }
       // System.out.println(listaNPrimos);
        System.out.println("Indica el nº de columnas para mostrar los nº primos");
        int columnas = scanner.nextInt();
        //scanner.close();
        mostrarFormateadosNPrimos(listaNPrimos, columnas);
        double valorMedio = calcularMediaPrimos(listaNPrimos);
        System.out.printf("%nLa media de los nº primos de la lista vale %.2f%n", valorMedio);
        ///////////////////////////////////////////////////////
        //     EXTRA, NO ESTÁ EN LA RELACIÓN DE EJERCICIOS  ///
        ///////////////////////////////////////////////////////
        //solicitar dos nº inferiores al tamaño de la lista y distintos
        //crear una nueva lista que rellene desde las dos posiciones, ejemplo
        // 3 y 7, crea una nueva lista de nº primos con los elementos de las posiciones:
        //3, 4, 5, 6 y 7
        //CREAMOS ÚN MÉTODO PARA ESTO, SOLO SE PASA LA LISTA COMO PARÁMETRO
        //ESTE MÉTODO DEVUELVE UNA NUEVA LISTA
        //mostramos el contenido de la nueva lista
        List<Integer> sublistaPrimos = obtenerSublistaPrimos(listaNPrimos);
        System.out.println(sublistaPrimos);
    }

    private static List<Integer> obtenerSublistaPrimos(List<Integer> listaNPrimos) {
        List<Integer> sublista = new ArrayList<>();
        int[] posiciones = new int[2];
        do {
            System.out.printf("Introduce dos posiciones distintas entre 0 y %d%n", listaNPrimos.size());
            posiciones[0] = scanner.nextInt();
            posiciones[1] = scanner.nextInt();
        } while (posiciones[0] < 0 || posiciones[1] < 0 ||
                posiciones[0] >= listaNPrimos.size() ||
                posiciones[1] >= listaNPrimos.size() ||
                posiciones[0] == posiciones[1]);
        //ordenamos datos, posicion[0] será la pequeña y posicion[1] la grande
        Arrays.sort(posiciones);
        for (int i = posiciones[0]; i <= posiciones[1] ; i++) {
            sublista.add(listaNPrimos.get(i));
        }
        return sublista;
    }

    private static double calcularMediaPrimos(List<Integer> listaNPrimos) {
        double suma = 0;
        for (int primo : listaNPrimos) {
            suma += primo;
        }
        return suma / listaNPrimos.size();
    }

    private static int obtenerNumeroCorrecto() {
        int numero;
        do {
            System.out.println("Introduce primer número, superior a 1");
            numero = scanner.nextInt();
        } while (numero <= 1);
        return numero;
    }

    private static void mostrarFormateadosNPrimos(List<Integer> listaNPrimos, int columnas) {
        for (int i = 0; i < listaNPrimos.size(); i++) {
            if (i % columnas == 0)
                System.out.println();
            System.out.printf("%6d", listaNPrimos.get(i));
        }
    }

    private static boolean esPrimo(int numero) {
        for (int i = 2; i < numero ; i++) {
            if ( numero % i == 0)
                return false;
        }
        return true;
    }
}
