package ColecciónDatos.Apartamento;


import java.util.LinkedList;


import javax.swing.JOptionPane;

/*
Desarrolla una aplicación en Java que permita registrar edificios.
Los edificios tienen la siguiente estructura: Nombre, dirección y número de apartamentos.
La aplicación debe imprimir en pantalla o en consola la lista de edificios cada vez que sea agregado uno.
Adicionalmente la lista siempre debe mostrarse ordenada de manera ascendente por el número de apartamentos de los edificios.
Utiliza el método de inserción para ordenar la lista.
 */
public class EdificioPila {

    public static void main(String[] args) {

        LinkedList<Apartamento> edificio = new LinkedList<>();

        String respuesta;
        do {
            JOptionPane.showMessageDialog(null, "Registro de edificios");
            agregar(edificio);
            mostrar(edificio);

            respuesta = JOptionPane.showInputDialog(null, "Desea ingresar otro edificio  SI/NO");

            respuesta = respuesta.toUpperCase();
        } while (respuesta.equals("SI"));

    }

    private static void agregar(LinkedList<Apartamento> edificio) {
        String nombre = JOptionPane.showInputDialog(null, "ingrese nombre del edificio");
        String direccion = JOptionPane.showInputDialog(null, "ingrese direccion del edificio");
        int na = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero de apartamentos del edificio"));
        edificio.addFirst(new Apartamento(nombre, direccion, na));

    }

    private static void mostrar(LinkedList<Apartamento> edificio) {
        String rpta = "";
        for (int i = 0; i < edificio.size(); i++) {
            for (int j = i + 1; j < edificio.size(); j++) {
                if (edificio.get(i).getNumeroapartamentos() > edificio.get(j).getNumeroapartamentos()) {
                    Apartamento auxiliar = edificio.get(i);
                   //edificio.get(i) = edificio.get(j);
                    //edificio.get(j)= auxiliar;

                }
            }
        }

        for (int i = 0; i < edificio.size(); i++) {
            rpta += edificio.get(i).Mostrar();
        }
        JOptionPane.showMessageDialog(null, rpta);
    }

}
