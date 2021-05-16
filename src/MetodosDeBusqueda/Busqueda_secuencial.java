
package MetodosDeBusqueda;

import javax.swing.JOptionPane;

//Se busca un elemento dentro de un arreglo, la busqueda ese la denomina secuencial

public class Busqueda_secuencial {

 
    public static void main(String[] args) {
        
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo"));
        int arreglo[]=new int [tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            int pos=i+1;
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese valor en la posicion :" + pos));
        }
        int dato= Integer.parseInt(JOptionPane.showInputDialog("ingrese dato a buscar"));
        
        int busqueda=busquedasecuencial(arreglo,dato);
        if(busqueda!=-1){
            int bus= busqueda+1;
            JOptionPane.showMessageDialog(null,"el dato ha sido encontrado dentro del arreglo en la posicion "+ bus);
        }else{
            JOptionPane.showMessageDialog(null,"el dato no ha sido encontrado");
        }
    }

    private static int busquedasecuencial(int[] arreglo, int dato) {
        for (int i = 0; i < arreglo.length; i++) {
            if(dato==arreglo[i]){
                return i;
            }
        } return -1;
 
    
    
}
}
