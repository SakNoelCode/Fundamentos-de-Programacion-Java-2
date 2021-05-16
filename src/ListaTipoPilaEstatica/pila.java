package ListaTipoPilaEstatica;


public class pila {
    int vector [];
    int cima;
    //constructor
    public pila(int tamaño){
        this.vector=new int [tamaño];
        cima=-1;
    }
    
    //metodo push //para añadir un dato al arreglo
    public void Empujar(int dato){
        cima++;
        vector[cima]=dato;
    }
    
    //metodo pop  //para sacar un elemento del arreglo
    public int Pop(){
        int aux=vector[cima];
        cima--;
        return aux;
    }
    
    //metodo para saber si la pila esta vacia
    public boolean PilaVacia(){
         return cima==-1;
     }
    
    //metodo para saber si la pila esta llena
    public boolean PilaLlena(){
        return vector.length-1==cima;
    }
    
    //metodo para saber que elemento se encuentra en la cima
    public int Cima(){
        return vector[cima];
    }
    
    //metodo para saber el tamaño de la pila
    public int TamañoPila(){
        return vector.length;
    } 
}
