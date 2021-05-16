
package arearectangulo;

import java.util.Scanner;

//Se muestra como hallar el area de un rectangulo a traves de un objeto

public class Rectangulomain {
    
    
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("dame el valor de la base ");
        int base = entrada.nextInt();
        System.out.print("dame el valor de la altura ");
        int altura= entrada.nextInt();
        
        rectangulo menso = new rectangulo(base,altura);
        
        menso.imprimir();
    }
}
