package extra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> listaNombres = Files.readAllLines(Path.of("datos.txt"));
        System.out.printf("Leidos %d nombres %n", listaNombres.size());
        //probando existe nombre
        String nombreExiste = "Zolly";
        System.out.printf("¿Existe %s en la lista? %B%n", nombreExiste,
                Axuliar.existeNombre(listaNombres, nombreExiste));
        String nombreNoExiste = "Zolli";
        System.out.printf("¿Existe %s en la lista? %B%n", nombreNoExiste,
                Axuliar.existeNombre(listaNombres, nombreNoExiste));
        String nombreExisteMayuscula = "ZOLLY";
        System.out.printf("¿Existe %s en la lista? %B%n", nombreExisteMayuscula,
                Axuliar.existeNombre(listaNombres, nombreExisteMayuscula));
        //añadiendo nombre
        boolean resultadoAdd = Axuliar.addNombre(listaNombres, "Juan");
        System.out.printf("¿Añadido nuevo nombre? %B%n", resultadoAdd);
        System.out.printf("Nuevo tamaño de la lista %d%n", listaNombres.size());
        boolean resultadoEliminar = Axuliar.eliminarNombre(listaNombres, "Juan");
        System.out.printf("¿Eliminado nombre? %B%n", resultadoEliminar);
        System.out.printf("Nuevo tamaño de la lista %d%n", listaNombres.size());
    }
}
