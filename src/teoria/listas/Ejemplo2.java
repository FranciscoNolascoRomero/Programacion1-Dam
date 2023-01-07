package teoria.listas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<>(); //creamos lista vacía de String
        //añadimos cuatro valores
        listaNombres.add("Juan García");
        listaNombres.add("Felipe Merino");
        listaNombres.add("María Abolafia");
        listaNombres.add("Pepita Jiménez");
        //mostramos los datos
        System.out.println(listaNombres);
        //mostramos el tamaño, usamos el método size()
        System.out.printf("Tamaño de la lista %d%n", listaNombres.size());
        listaNombres.add("Luis de la Casa");  //añadimos otro elemento
        System.out.println(listaNombres);
        //PROGRAMACIÓN SEGURA, EVITAMOS EXCEPCIONES
        if (!listaNombres.isEmpty())  //comprobamos si está vacía
            listaNombres.remove(listaNombres.size() - 1); //eliminamos el último elemento
        System.out.println(listaNombres);
        if (!listaNombres.isEmpty())
            listaNombres.remove(0);
        System.out.println(listaNombres);
        listaNombres.clear();  //limpiamos de datos la lista
        System.out.println(listaNombres);
       if ( ! listaNombres.isEmpty() )
            listaNombres.remove(0);
    }
}
