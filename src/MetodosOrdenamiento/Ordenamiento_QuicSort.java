
package MetodosOrdenamiento;

public class Ordenamiento_QuicSort {

    public static void main(String[] args) {
        
        int vector[]= {2,4,46,65,23,11,2};
        
        //para que el usuario ingrese ev valor de donde que inicie y finalize la ordenacion de cambia
        //lo sgte:
        //                    se cambia a la posicion inicial que quieras //////se cambia la posicion final que quieras
        OrdenarQuicSort(vector,          0                           ,          vector.length-1                           );
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
 
    }

    private static void OrdenarQuicSort(int[] vector, int pri, int ulti) {
       int i=pri;
       int j=ulti;
       int pivote= vector[(i+j)/2];
        do {
            
            //para ordenarlo descendentemente tienes que cambiarle
            //el signo de comparacion en los dos bucles while
            while(vector[i]<pivote){
                i++;
            }
            while(vector[j]>pivote){
                j--;
            }
            if(i<=j){
                int aux =vector[i];
                vector[i]=vector[j];
                vector[j]=aux;
                i++;
                j--;
            }
            
        } while (i<=j);
        if(pri<j){
            OrdenarQuicSort(vector, pri,j);
        }
        if(i<ulti){
            OrdenarQuicSort(vector, i, ulti);
        }
    }
    
}
