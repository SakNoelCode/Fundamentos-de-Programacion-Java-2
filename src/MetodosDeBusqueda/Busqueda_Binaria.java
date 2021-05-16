
package MetodosDeBusqueda;

import javax.swing.JOptionPane;

//Se busca un elemento dentro de un arreglo, la busqueda ese la denomina binaria


public class Busqueda_Binaria {

    public static void main(String[] args) {
        
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo"));
        int vector[]= new int[tamaño];
         JOptionPane.showMessageDialog(null,"Debe escribir un arreglo ordenado");
        for (int i = 0; i < vector.length; i++) {
            int pos= i+1;
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese valor en la posicion "+ pos));
        }
       
        int dato= Integer.parseInt(JOptionPane.showInputDialog("ingrese dato a buscar"));
        
        int busqueda=busquedabinaria(vector,dato);
        if(busqueda!=-1){
            int bus= busqueda+1;
            JOptionPane.showMessageDialog(null,"dato encontrado [posicion "+ bus+"]");
        }else{
            JOptionPane.showMessageDialog(null,"el dato no ha sido encontrado");
        }
        
   
    }

    private static int busquedabinaria(int[] vector, int dato) {
        int inferior=0,superior=vector.length-1,centro,valorcentro;
        while(inferior<=superior){
            centro=(superior+inferior)/2;
            valorcentro=vector[centro];
            if(dato == valorcentro){
                return centro;
            }else if(dato<valorcentro){
               
                superior=centro-1;
            }else if(dato>valorcentro){
              
                inferior=centro+1;
            }
        }
        return -1;
    }
    
}
