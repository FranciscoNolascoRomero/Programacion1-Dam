package ejercicios;

import java.util.Arrays;

/**
 * Clase que realiza operaciones sobre colecciones de temperaturas
 * @author Manuel
 * @version 1.0.0
 *
 */
public class DatosTemperatura {
    private DatosTemperatura() {
    }

    /**
     * @hidden
     */
    public static void main(String[] args) {

        int[] temperaturasMaximas = {12, 14, 15, 16, 18, 15, 14};
        int[] temperaturasMinimas = {8, 8, 8, 5, 7, 8, 9, 8};
        //valor medio de las temperaturas máximas y mínimas
        double[] valoresMedios = calcularValorMedioTemperaturas(
                temperaturasMaximas, temperaturasMinimas);
        System.out.println(Arrays.toString(valoresMedios));
        //desviación típica de las temperaturas máximas
        double desviacionTipicaTemperaturasMaximas =
                calcularDesviacionTipicaTemperaturasMaximas(temperaturasMaximas);
        System.out.printf("Desviación típica temperaturas: %.2f%n",
                desviacionTipicaTemperaturasMaximas);
        int nuMeroDiasTemperaturaMinimaPorDebajoMedia =
                calcularNuMeroDiasTemperaturaMinimaPorDebajoMedia(temperaturasMinimas);
        System.out.printf("Nº días por debajo de la media de la temperatura mínima: %d %n",
                nuMeroDiasTemperaturaMinimaPorDebajoMedia);
    }

    /**
     * Método que calcula el número de días de una colección de temperaturas
     * que están por debajo de un valor mínimo
     * @param temperaturasMinimas colección de datos de tipo int
     * @return el número de días
     */
    public static int calcularNuMeroDiasTemperaturaMinimaPorDebajoMedia(
            int[] temperaturasMinimas) {
        int contadorDeTemparturasPorDebajoMedia = 0;
        final double TEMPERATURA_MEDIA = getTemperaturaMedia(temperaturasMinimas);
        for (int temperaturasMinima : temperaturasMinimas) {
            //si la temeparturaMinima < temperaturaMedia, incremento contadorDeTemparturasPorDebajoMedia
            if (temperaturasMinima < TEMPERATURA_MEDIA)
                contadorDeTemparturasPorDebajoMedia++;
        }
        return contadorDeTemparturasPorDebajoMedia;
    }

    /**
     * Método que calcula la desviación típica de una colección de
     * temperaturas que suelen ser valores máximos
     * @param temperaturasMaximas la colección temperaturas máximas
     * @return desviación típica
     */
    public static double calcularDesviacionTipicaTemperaturasMaximas(int[] temperaturasMaximas) {
        double suma = 0;
        double valorMedio = getTemperaturaMedia(temperaturasMaximas);
        for (int temperaturaMaxima:  temperaturasMaximas) {
            suma += Math.pow(temperaturaMaxima - valorMedio, 2);
        }
        return Math.sqrt(suma / (temperaturasMaximas.length - 1));
    }

    /**
     * Método que devuelve una colección de dos datos, siendo el primero
     * el valor medio de las temperaturas máximas y el segundo el
     * valor medio de las temperaturas mínimas
     * @param temperaturasMaximas colección de temperaturas máximas
     * @param temperaturasMinimas colección de temperaturas mínimos
     * @return un array de longitud 2, siendo el primero dato el valore medio
     * de las temperaturas máximas y el segundo de las mínimas
     */
    public static double[] calcularValorMedioTemperaturas(int[] temperaturasMaximas, int[] temperaturasMinimas) {

        /*double temperaturaMaximaMedia = getTemperaturaMedia(temperaturasMaximas);
        double temperaturaMinimaMedia = getTemperaturaMedia(temperaturasMinimas);
*/
       /* ** double[] valoresMedios = new double[2];
        valoresMedios[0] = temperaturaMaximaMedia;
        valoresMedios[1] = temperaturaMinimaMedia;
        return valoreMedios;
        ** */

      //  return new double[]{temperaturaMaximaMedia, temperaturaMinimaMedia};
        return new double[]{getTemperaturaMedia(temperaturasMaximas),
                getTemperaturaMedia(temperaturasMinimas)};
    }

    /**
     * Método que devuelve el valor medio de una colección de temperaturas
     * @param temperaturas datos a calcular el valor medio
     * @return la temperatura media
     */
    public static double getTemperaturaMedia(int[] temperaturas) {
        int sumaDatos = 0;
        for (int temperatura : temperaturas) {
            sumaDatos += temperatura;
        }
        /*double temperaturaMedia = 1.0 * sumaDatos / temperaturas.length;
        return temperaturaMedia;*/
        return 1.0 * sumaDatos / temperaturas.length;
    }
}


