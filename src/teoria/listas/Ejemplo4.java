package teoria.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo4 {
    public static void main(String[] args) {

        /*1*/ char[] arrayChar = {'a', '\t', ' ', '@', '5',  's'};
        /*2*/ System.out.printf("Tamaño del array %d%n", arrayChar.length);
        /*3*/ System.out.println(arrayChar);
        System.out.println(Arrays.toString(arrayChar));
        /*4*/ arrayChar[arrayChar.length - 1] = 'S';
        /*5*/ for (int i = 0; i < arrayChar.length; i++) {
            System.out.printf("En la posición %d: --%c--%n", i, arrayChar[i]);
        }
        //usamos un bucle foreach
        /*6*/System.out.println("======================");
        for (char caracter : arrayChar) {
            System.out.println("CARACTER: " + "--" + caracter + "--");
        }
        System.out.println("======================");

        /*1*/ List<Character> listaChar = new ArrayList<>();
        listaChar.add('a'); listaChar.add('\t'); listaChar.add(' ');
        listaChar.add('@'); listaChar.add('5'); listaChar.add('s');
        /*2*/ System.out.printf("Tamaño de la lista %d%n", listaChar.size());
        /*3*/ System.out.println(listaChar);
        /*4*/ listaChar.set( listaChar.size() - 1,'S');
        /*5*/ for (int i = 0; i < listaChar.size(); i++) {
            System.out.printf("En la posición %d: --%c--%n", i, listaChar.get(i));
        }
        /*6*/
        System.out.println("*********************");
        for( char caracter  : listaChar ){
            System.out.println("CARACTER: " + "--" + caracter + "--");
        }
        System.out.println("*********************");

    }
}
