
package MetodosOrdenamiento;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ordenamiento_Seleccion {

    public static void main(String[] args) {
        
        int tamaño= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tamaño del arreglo"));
        
        int vector[]= new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese valor en la posicion " +i));
        }
        ordenamiento_seleccion(vector);
        JOptionPane.showMessageDialog(null,"se mostrara el arreglo ordenado");
        JOptionPane.showMessageDialog(null,Arrays.toString(vector));
     
    }

    private static void ordenamiento_seleccion(int[] vector) {
          for (int i = 0; i < vector.length; i++) {
            int minimo = i;
            for (int j = i+1; j < vector.length; j++) {
                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }
            if (i != minimo) {
               int aux = vector[i];
               vector[i] = vector[minimo];
               vector[minimo] = aux;
            }
        }
        
        
        
        
        
    }
    
}
