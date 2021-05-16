
package arearectangulo;


public class rectangulo {
    
    
    private int base, altura, area;
    
    public rectangulo(int base, int altura){
        this.base= base;
        this.altura = altura;
    }
    public void calculodearea(){
        area=base*altura;
        
    }
    
    public void imprimir(){
        calculodearea();
        System.out.println("el area es "+ area);
    }
}
