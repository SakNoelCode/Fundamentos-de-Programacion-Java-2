
package ColecciónDatos.Apartamento;

public class Apartamento {
    
  
    
    private final String nombreapartamento;
    private final String direccion;
    private final int numeroapartamentos;

    public Apartamento(String nombreapartamento, String direccion, int numeroapartamentos) {
        this.nombreapartamento = nombreapartamento;
        this.direccion = direccion;
        this.numeroapartamentos = numeroapartamentos;
    }

    public int getNumeroapartamentos() {
        return numeroapartamentos;
    }
    
    
   public String Mostrar(){
       return " \n\nNombre de Apartamento: "+ nombreapartamento+ "\nDireccion: "+ direccion+ "\nNumero de Apartamentos: "+
               numeroapartamentos;
   }
   
   
   

    
   
}

    
