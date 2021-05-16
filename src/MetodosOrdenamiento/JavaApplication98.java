/*ingresar por teclado el tamaño de un array
*ingresar sus elementos
y ordenarlos utilizando el metodo 
de burbuja
 */
package MetodosOrdenamiento;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class JavaApplication98 {

    public static void main(String[] args) {
        
       int tam= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el tamaño del arreglo"));
       
       int []vector= new int[tam];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese valor en la posicion "+ i));
        }
        ordenamiento_burbuja(vector);
       
       
            JOptionPane.showMessageDialog(null,"ordenado");
            JOptionPane.showMessageDialog(null,Arrays.toString(vector));
        
    }

    
    public static void ordenamiento_burbuja(int[] vector) {
         for (int i = 0; i < vector.length; i++) {
            for (int j = i+1; j < vector.length; j++) {
                if(vector[i]>vector[j]){
                    int tem= vector[i];
                    vector[i]=vector[j];
                    vector[j]=tem;
                }
            }
            
        }
    }
    
}
