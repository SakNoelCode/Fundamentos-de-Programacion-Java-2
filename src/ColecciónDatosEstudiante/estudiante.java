package ColecciónDatosEstudiante;


public class estudiante implements Comparable{
    public int codigo;
    public int nota1;
    private int nota2;
     private int nota3;
    private String nombre;
    public int notafinal;

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public estudiante(String nombre,int codigo, int nota1, int nota2, int nota3) {
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nombre = nombre;
    }
   
    public int Promedio(int nota1,int nota2,int nota3){
        notafinal = (int) (nota1*0.3+nota2*0.3+nota3*0.4);
        return notafinal;
    }

    @Override
    public int compareTo(Object o) {
        estudiante e= (estudiante)o;
        return 0;
      
           }
    
    
}
