package ListaTipoPilaDinamica;

import javax.swing.JOptionPane;

public class ListaTipoPilaDinamica {

    public static void main(String[] args) {

        int opcion = 0, elemento = 0;

        Pila mensajero = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Añadir un elemento a la pila\n"
                        + "2.Sacar un elemento de la pila\n"
                        + "3.¿La pila esta vacia?\n"
                        + "4.Elemento que se encuentra en la cima\n"
                        + "5.Tamaño de la pila\n"
                        + "6.Vaciar la Pila\n"
                        + "7.Salir\n"
                        + "QUE DESEA HACER", "MENU DE OPCIONES", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese un elemento a la pila", "LLENANDO PILA", JOptionPane.INFORMATION_MESSAGE));
                            mensajero.InsertarElemento(elemento);
                       break;
                    case 2:
                        if (!mensajero.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + mensajero.SacarElemento(),
                                    "SACANDO ELEMENTO", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:

                        if (mensajero.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "VACIA", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia",
                                    "VACIA", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!mensajero.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es " + mensajero.Cima(),
                                    "PILA CIMA", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es " + mensajero.tamañoPila(),
                                "TAMAÑO PILA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if(!mensajero.PilaVacia()){
                         mensajero.LimpiarPila();
                         JOptionPane.showMessageDialog(null,"La pila se ha vaciado" , "LIMPIANDO PILA" ,
                                 JOptionPane.INFORMATION_MESSAGE);   
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "VACIA", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO", "FIN", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INCORRECTA", "ERROR", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null,"ERROR" + n.getMessage());
            }

        } while (opcion != 7);

    }

}
