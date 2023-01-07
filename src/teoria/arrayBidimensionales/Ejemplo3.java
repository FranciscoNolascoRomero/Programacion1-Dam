package teoria.arrayBidimensionales;

public class Ejemplo3 {
   /*static double[][][] datos = {
                              {
                                  {3.2, -6e2},
                                  {1, -1.1e-1}
                              },
                              {
                                  {1.2},
                                  {5,5, 67},
                                  {0, 12, 1.1, 6}
                              },
                              {
                                  {5, 5 , 5.5 , 6.23}
                              }
                          };*/

    public static void main(String[] args) {
        final double[][][] VALORES =
                {{{1,2},{2,3}, {5.5,7}}, {{8,9.3}}, {{1,1,1}, {0}}};
        mostrarDatos(VALORES);
        double suma = sumarDatos(VALORES);
        System.out.println("==========================");
        System.out.printf("La suma de los datos vale %.3f%n", suma);
    }

    private static double sumarDatos(double[][][] datos) {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                for (int k = 0; k < datos[i][j].length; k++) {
                    suma += datos[i][j][k];
                }
            }
        }
        return suma;
    }

    private static void mostrarDatos(double[][][] valores) {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                for (int k = 0; k < valores[i][j].length; k++) {
                    System.out.printf("datos[%d][%d][%d] = %.2f%n",
                                i, j, k, valores[i][j][k]);
                }
            }
        }
    }
}
