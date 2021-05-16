package ColecciónDatos.Pcs;

import java.util.LinkedList;
import javax.swing.JOptionPane;


public class ListaTipoColaLinkedListEjercicio {

    public static void main(String[] args) {

        LinkedList<computadorajava> pila = new LinkedList<>();

        int opc = 0;

        do {
            try{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar un PC a la pila"
                    + "\n2.Eliminar un PC de la pila"
                    + "\n3.Mostrar la pila"
                    + "\n4.Salir", "MENU DE OPCIONES" ,JOptionPane.INFORMATION_MESSAGE));

            switch (opc) {
                case 1:
                    agregar(pila);
                    break;
                case 2:
                    eliminar(pila);
                    break;
                case 3:
                    mostrar(pila);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
            }
            }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null, n.getMessage());
                    }

        } while (opc != 4);

    }

    private static void agregar(LinkedList<computadorajava> pila) {
        String mac = JOptionPane.showInputDialog(null, "Ingrese numero de Mac:");
        String procesador = JOptionPane.showInputDialog(null, "ingrese tipo de procesador: ");
        int ram = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese capacidad RAM"));
        int DiscoDuro = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese capacidad de Disco Duro"));

        pila.addFirst(new computadorajava(mac, procesador, ram, DiscoDuro));
        JOptionPane.showMessageDialog(null, "PC agregada con exito");
    }

    private static void eliminar(LinkedList<computadorajava> pila) {
        pila.removeFirst();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el ultimo PC ingresado");
    }
    
    private static void mostrar(LinkedList <computadorajava> pila ){
        String rpta="";
        for (int i = 0; i < pila.size(); i++) {
            rpta+=pila.get(i).toString();
        }
        JOptionPane.showMessageDialog(null, rpta);
    }
    

}
