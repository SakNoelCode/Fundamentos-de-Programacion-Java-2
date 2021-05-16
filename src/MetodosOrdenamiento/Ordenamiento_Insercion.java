
package MetodosOrdenamiento;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ordenamiento_Insercion {

    public static void main(String[] args) {
          int tamaño= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tamaño del arreglo"));
        
        int vector[]= new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese valor en la posicion " +i));
        }
        ordenamiento_insercion(vector);
        JOptionPane.showMessageDialog(null,Arrays.toString(vector));
     
    }

    private static void ordenamiento_insercion(int[] vector) {
        
       for (int i = 1; i < vector.length; i++) {
           int aux = vector[i];
           int j = i-1;
           while( j >= 0 && (aux < vector[j] )){
              vector[j+1] = vector[j];
               j--;
           }
           vector[j+1] = aux;
       }
       
       
        
    }
      
    }
    

