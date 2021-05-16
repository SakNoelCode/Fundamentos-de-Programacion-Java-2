package TipoListas;


import java.util.Stack;
import javax.swing.JOptionPane;


public class ListaTipoPilaClaseStack {

 
    public static void main(String[] args) {
       
        
        Stack pilita = new Stack();
        
        JOptionPane.showMessageDialog(null,"La pila esta vacia?  " + pilita.empty());
        //sirve para agregar un elemento a la pila
        pilita.push(11);
        pilita.push(13);
        pilita.push(32);
        pilita.push(34);
        pilita.push(24);
        
        
       

        JOptionPane.showMessageDialog(null,"Tamaño de la pila: "+ pilita.size());

        JOptionPane.showMessageDialog(null,"La cima es: "+ pilita.peek());
        JOptionPane.showMessageDialog(null,"Sacando al elemento "+ pilita.pop()+ " de la pila");
        JOptionPane.showMessageDialog(null,"Sacando al elemento "+ pilita.pop()+ " de la pila");
        JOptionPane.showMessageDialog(null,"Tamaño de la pila: "+ pilita.size());
        JOptionPane.showMessageDialog(null,"La pila esta vacia ? "+ pilita.empty());
        JOptionPane.showMessageDialog(null,"Sacando al elemento "+pilita.remove(0)+"de la pila");
        JOptionPane.showMessageDialog(null,"El primer elemento de la pila es "+ pilita.firstElement());
        for (int i = 0; i < pilita.size(); i++) {
            String  rpta="";
            JOptionPane.showMessageDialog(null, pilita.get(i)+"\n");
            
        }


    }
    
}
