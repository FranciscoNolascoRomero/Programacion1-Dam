package teoria.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        final int NUMERO_VALORES = 10;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //crear una lista dinámica de enteros
        List<Integer> listaEnteros = new ArrayList<>();
        // System.out.println(listaEnteros);
        //usando un bucle fori, rellenamos con 10 valores aleatorios de 1 a 100 inclusive
        for (int i = 0; i < NUMERO_VALORES; i++) {
            listaEnteros.add(random.nextInt(100) + 1);
        }
        //mostramos datos
        //  System.out.println(listaEnteros);
        //cada elemento se va a multiplicar por 2 y se guarda en la misma posición
        for (int i = 0; i < listaEnteros.size(); i++) {
            //System.out.println(listaEnteros.get(i) * 2);
            listaEnteros.set(i, listaEnteros.get(i) * 2);
        }
        //ejemplo [1, 100, 2, ..., 5, 9] al final queda [2, 200, 4, ..., 10, 18]
        System.out.println(listaEnteros);

        //Averiguar algún número
        //usamos Scanner, pedimos al usuario un nº
        //comprobamos si está en la lista
        //si está en la lista mostramos en consola toda la lista
        //sino está solicitamos otro número hasta que esté en la lista
        int numero = -1;
        do {
            System.out.println(
                    "Introduce un nº comprendido entre 2 y 200 inclusive y siempre par");
            numero = scanner.nextInt();
            if (numero < 2 || numero > 200) {
                System.out.printf("%d fuera de rango%n", numero);
                continue;
            }
            if (numero % 2 != 0)
                System.out.printf("%d es impar%n", numero);
        } while (!listaEnteros.contains(numero));

        System.out.printf("ENHORABUENA %d está en la lista%n", numero);
        System.out.printf("Se encuentra en la posición %d%n", listaEnteros.indexOf(numero));
        System.out.println(listaEnteros);
        boolean contiene = contieneElemento(listaEnteros, numero);
        System.out.println(contiene);

    }
    //método estático que pasemos la lista y un elemento, nos diga si lo contien o no
    //no se puede usar el método contains
    private static boolean contieneElemento(List<Integer> lista, int elemento){
        /*for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == elemento)
                return true;
        }*/
        for (int numero: lista) {
            if(numero == elemento)
                return true;
        }
        return false;
    }


}
