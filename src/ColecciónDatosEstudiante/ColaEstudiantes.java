package ColecciónDatosEstudiante;

/*
Desarrolla una aplicación en Java que registre estudiantes, 
los cuales tienen las siguientes características:
Código, nombre, nota 1, nota 2, nota 3, nota final.
Se debe calcular la nota final del estudiante teniendo 
en cuenta que la primera y segunda nota son equivalentes 
al 30% de la nota final cada una, y la última nota equivale al 40%.
Luego ordenarlos por este atributo utilizando el 
método de ordenamiento por selección. 
Nota: puedes utilizar cualquier estructura de datos.

 */
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ColaEstudiantes {

    public static void main(String[] args) {

        LinkedList<estudiante> alumnos = new LinkedList<>();
        

        int opc = 0;

        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar un estudiante"
                        + "\n2.Notas finales de los estudiantes"
                        + "\n3.Ordenar la notas (Seleccion)"
                        + "\n4.Salir", "ESTUDIANTES", JOptionPane.INFORMATION_MESSAGE));

                switch (opc) {
                    case 1:
                        agregar(alumnos);
                        break;
                    case 2:
                        notasfinales(alumnos);
                        break;
                    case 3:
                        ordenarnotas(alumnos);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, n.getMessage());
            }

        } while (opc != 4);

    }

    private static void agregar(LinkedList<estudiante> alumnos) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del estudiante");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese codigo del estudiante"));
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "nota 1 del estudiante"));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "nota 2 del estudiante"));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "nota 3 del estudiante"));
        alumnos.addFirst(new estudiante(nombre, codigo, nota1, nota2, nota3));
        JOptionPane.showMessageDialog(null, "Alumno agregado con exito");

    }

   
    private static void ordenarnotas(LinkedList<estudiante> alumnos) {
        
      /*  for (int i = 0; i < alumnos.size(); i++) {
            for(int j=1;i<alumnos.size();j++){
               
            }
            
        }*/
    }
    
    

    private static void notasfinales(LinkedList<estudiante> alumnos) {
        String nombre="";
        
        for (int i = 0; i < alumnos.size(); i++) {
            nombre +=  "ALUMNO: "+alumnos.get(i).getNombre()+ "------->PROMEDIO: " +alumnos.get(i).Promedio(alumnos.get(i).getNota1(), alumnos.get(i).getNota2(), alumnos.get(i).getNota3())+"\n";
           
        }
         JOptionPane.showMessageDialog(null,nombre);
    }

}
