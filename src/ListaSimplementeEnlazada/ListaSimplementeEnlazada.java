package ListaSimplementeEnlazada;


import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class ListaSimplementeEnlazada {

  
    public static void main(String[] args) {
        
        Lista mensajero = new Lista();
       
        int opcion=0,elemento;
        do {            
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Agregar un elemento al inicio de la lista  \n2. Agregar un elemento al final de la lista  "
                                +"\n3.Mostrar la lista"
                                +"\n4.Eliminar un elemento al inicio de la lista"
                                +"\n5.Eliminar un elemento al final de la lista"
                                +"\n6.Eliminar un elemento en especifico"
                                +"\n7.Buscar un elemento"
                                +"\n8.Salir ", "MENU DE OPCIONES", 3));
                
                switch(opcion){
                    case 1:
                        try {
                            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento ", 
                                    "Insertando al inicio", 3));
                            //agregando un elemento 
                            mensajero.AgregarAlInicio(elemento);
                        } catch (NumberFormatException n) {               ///esto sirve para mandar a llamar el error
                            JOptionPane.showMessageDialog(null,"ERROR " + n.getMessage());
                        }
                       break;
                    case 2:
                        try {
                            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento ", 
                                    "Insertando al final", 3));
                            //agregando un elemento 
                            mensajero.AgregarFinal(elemento);
                        } catch (NumberFormatException n) {               ///esto sirve para mandar a llamar el error
                            JOptionPane.showMessageDialog(null,"ERROR " + n.getMessage());
                        }
                       
                        break;
                    case 3:
                         mensajero.MostrarLista();
                        break;
                    case 4:
                         elemento=mensajero.BorraInicio();
                         JOptionPane.showMessageDialog(null,"El elemento eliminado es "+ elemento,"ELIMINANDO NODO AL INICIO",
                                 JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        elemento=mensajero.BorrarDelFinal();
                         JOptionPane.showMessageDialog(null,"El elemento eliminado es "+ elemento,"ELIMINANDO NODO AL FINAL",
                                 JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                         elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento a eliminar "));
                       
                        if(mensajero.EliminarNodo(elemento)==true){
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es "+ elemento,"ELIMINANDO NODO EN ESPECIFICO",
                                 JOptionPane.INFORMATION_MESSAGE);
                        }else if(mensajero.EliminarNodo(elemento)==false){
                            JOptionPane.showMessageDialog(null,"ERROR....El elemento no se encuentra en la lista");
                        }
                       break;
                    case 7:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento a buscar ", 
                                "BUSCANDO ELEMENTOS",JOptionPane.INFORMATION_MESSAGE));
                        if(mensajero.BuscarElemento(elemento)==true){
                            JOptionPane.showMessageDialog(null, "El elemento " + elemento+ " se encuentra en la lista"
                            , "NODO ENCONTRADO" , JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El elemento " + elemento+ " no se encuentra en la lista"
                            , "NODO NO ENCONTRADO" , JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null,"PROGRAMA FINALIZADO");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null,"OPCION INCORRECTA");
                }
                    
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"ERROR " + e.getMessage());
            }
        } while (opcion!=8);
    }
    
}
