package extra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("LISTAS INMUTABLES");
        List<Integer> lista = List.of(1, 2, 1, 3, 4, 5, 4, 1, 2, 0, 11, 12);
        System.out.println("Lista declarada");
        System.out.println(lista);
       // lista.add(3); la lista es inmutable
       // lista.remove(1); la lista es inmutable
        //probando método frequency
        int numero = 1;
        int frecuencia = Collections.frequency(lista, numero);
        System.out.printf("La frecuencia del valor %d en la lista es %d%n", numero, frecuencia);
        //probando métodos max y min
        int maximo = Collections.max(lista);
        System.out.printf("El valor máximo de la lista es %d%n", maximo);
        int minimo = Collections.min(lista);
        System.out.printf("El valor mínimo de la lista es %d%n", minimo);
        //usando el método replaceAll
        /*int oldVal = 1, newVal=111;
        boolean resultado = Collections.replaceAll(lista, oldVal, newVal);
        System.out.printf("Cambiando %d por %d en la lista%n", oldVal, newVal);
        System.out.printf("Éxito de la operación %B%n", resultado);
        System.out.println(lista);*/
        //NO SE PUEDE HACER POR LA INMUTABILIDAD DE LA LISTA
        //definimos un array de enteros, con 7 valores
        //buscamos como transformarla en una List en una sentencia
        //probamos los métodos replaceAll, reverseOrder, sort, swap
        System.out.println("=========================");
        System.out.println("LISTAS MUTABLES");
        Integer[]  array = {9,1,2,3,5, 0};
        List<Integer> nuevaLista1 = Arrays.asList(array);
        List<Integer> nuevaLista2 = Arrays.asList(7, 3,1, 0, 2, 1);
        System.out.println("Lista original");
        System.out.println(nuevaLista2);
        //reemplazamos 1 por 11
        Collections.replaceAll(nuevaLista2, 1, 11);
        System.out.println("Lista cambiando 1 por 11");
        System.out.println(nuevaLista2);
        //invertimos el orden de la lista
        Collections.reverse(nuevaLista2);
        System.out.println("Lista invertida");
        System.out.println(nuevaLista2);
        //ordenamos la lista, en este caso de menor a  mayor
        Collections.sort(nuevaLista2);
        System.out.println("Ordenando la lista");
        System.out.println(nuevaLista2);
        //intercambiamos el primer elemento por el último
        if (!nuevaLista2.isEmpty())
            Collections.swap(nuevaLista2, 0, nuevaLista2.size() - 1);
        System.out.println("Intercambiado el primero por el último");
        System.out.println(nuevaLista2);

    }
}
