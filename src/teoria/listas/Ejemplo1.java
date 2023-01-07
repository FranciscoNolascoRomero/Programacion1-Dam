package teoria.listas;

import java.util.Arrays;

public class Ejemplo1 {
    public static void main(String[] args) {
        String[] nombres = {"Juan Mena", "Pedro Soler","Marisa Perales", "Carmina González"};
        //¿Cómo puede añadir un nombre más?
        String nuevoNombre = "Jacinto Ochando";
        //solución, crear una nueva colección de tamaño anterior mas 1
        //volcamos los datos de la vieja colección
        //finalmente añadimos el nuevo nombre a la posición
        String[] nuevoNombres = new String[nombres.length + 1];
        System.out.println(Arrays.toString(nuevoNombres));
        for (int i = 0; i < nombres.length; i++) {
            nuevoNombres[i] = nombres[i];
        }
        System.out.println(Arrays.toString(nuevoNombres));
        nuevoNombres[nuevoNombres.length -1] = nuevoNombre;
        System.out.println(Arrays.toString(nuevoNombres));
        //eliminar Pedro Soler
        nuevoNombres[1] = null;
        //crear un nuevo array con tamaño inferior al anterior en una unidad
        String[] nuevosDatos = new String[nuevoNombres.length -1];
        //recorrer el array de nuevos nombres y si la posición es null no se añada
        int contador = 0;
        /*while (true) {
            if (nuevoNombres[contador] != null){
                nuevosDatos[contador] = nuevoNombres[contador];
                contador++;
                if (contador == nuevosDatos.length)
                    break;
            }

        }*/
        System.out.println(Arrays.toString(nuevosDatos));

    }
}
