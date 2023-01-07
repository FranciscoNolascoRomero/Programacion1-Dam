package extra;

import java.util.List;

public class Axuliar {
    //métodos: buscar un nombre,
    // añadir nombres a la lista,
    // eliminar nombres de la lista
    public static boolean existeNombre(List<String> lista, String nombre) {
        //return lista.contains(nombre);

        for (String dato : lista) {
            if (dato.equalsIgnoreCase(nombre))
                return true;
        }
        return false;
    }
    public static boolean addNombre (List<String> lista, String nombre) {
        return lista.add(nombre);
    }
    public static boolean eliminarNombre (List<String> lista, String nombre) {
        return lista.remove(nombre);
    }
}
