package ListaTipoPilaEstatica;


import javax.swing.JOptionPane;


public class ListaTipoPilaEstatica {

    public static void main(String[] args) {
       
        int opcion =0, tamaño,elemento;
        
        try {
            tamaño=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese tamaño de la pila", "TAMAÑO DE PILA", JOptionPane.INFORMATION_MESSAGE));
            pila mensajero = new pila(tamaño);
            do {                
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
                                  "1.Añadir un elemento a la pila\n"
                                + "2.Sacar un elemento de la pila\n"
                                + "3.¿La pila esta vacia?\n"
                                + "4.¿la pila esta llena?\n"
                                + "5.Elemento que se encuentra en la cima\n"
                                + "6.Tamaño de la pila\n"
                                + "7.Salir\n"
                                + "QUE DESEA HACER?","MENU DE OPCIONES", JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un elemento a la pila", "LLENANDO PILA", JOptionPane.INFORMATION_MESSAGE));
                        if(!mensajero.PilaLlena()){
                            mensajero.Empujar(elemento);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila ya esta llena", 
                                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 2:
                        if(!mensajero.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es "+ mensajero.Pop(), 
                                    "SACANDO ELEMENTO", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", 
                                    "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                       
                       if(mensajero.PilaVacia()){
                           JOptionPane.showMessageDialog(null, "La pila esta vacia", 
                                    "VACIA", JOptionPane.INFORMATION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La pila no esta vacia", 
                                    "VACIA", JOptionPane.INFORMATION_MESSAGE);
                       }
                        break;
                    case 4:
                        if(mensajero.PilaLlena()){
                           JOptionPane.showMessageDialog(null, "La pila esta llena", 
                                    "LLENA", JOptionPane.INFORMATION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La pila no esta llena", 
                                    "LLENA", JOptionPane.INFORMATION_MESSAGE);
                       }

                        break;
                    case 5:
                        if( !mensajero.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es "+ mensajero.Cima(),
                                    "PILA CIMA", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia","ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es "+ mensajero.TamañoPila(),
                                "TAMAÑO PILA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7: 
                        JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO", "FIN",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default: 
                        JOptionPane.showMessageDialog(null, "OPCION INCORRECTA","ERROR", JOptionPane.INFORMATION_MESSAGE);
                                
                }
            } while (opcion !=7);
            
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null,"ERROR "+ n.getMessage());
        }
    }
    
}
