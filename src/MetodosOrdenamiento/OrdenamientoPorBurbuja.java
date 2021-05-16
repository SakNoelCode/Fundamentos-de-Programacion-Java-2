/*Desarrolla una aplicación en Java que permita ordenar ascendentemente un arreglo de N posiciones 
por medio del método o de ordenamiento burbuja. 
N = Número que decida el usuario.
 */
package MetodosOrdenamiento;

import java.util.Scanner;

public class OrdenamientoPorBurbuja {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo:");
        int t = in.nextInt();
        int arreglo[] = new int[t];
        int auxiliar = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("posición " + i + " : ");
            arreglo[i] = in.nextInt();

        }

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }

        System.out.print("ordenado en forma creciente: ");
        for (int i = 0; i < arreglo.length; i++) {

            System.out.print(arreglo[i] + ",");
        }
        System.out.println("");
        
        System.out.print("ordenado en forma decreciente: ");
        for (int i = (arreglo.length - 1); i >= 0; i--) {
            System.out.print(arreglo[i]+ ",");

        }

    }

}
