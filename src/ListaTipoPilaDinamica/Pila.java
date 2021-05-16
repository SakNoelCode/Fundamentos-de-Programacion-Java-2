
package ListaTipoPilaDinamica;

import ListaTipoPilaDinamica.NodoPila;

public class Pila {
    private NodoPila cima;
    int tamaño;
    
    public Pila(){
        cima=null;
        tamaño=0;
    }
    
    //Metodo para saber si la pila esta vacia
    public boolean PilaVacia(){
        return cima==null;
        
    }
    
    //Metodo para insertar un elemento en la pila
    public void InsertarElemento(int elemento){
        NodoPila Nuevo = new NodoPila(elemento);
        Nuevo.siguiente=cima;
        cima=Nuevo;
        tamaño++;
    }
    
    //Metodo para sacar un elemento de la lista
    public int SacarElemento(){
        int auxiliar = cima.dato;
        cima=cima.siguiente;
        tamaño--;
        return auxiliar;
    }
    
    //Metodo para saber quien esta en la cima de la pila
    public int Cima(){
        return cima.dato;
        
    }
    
    //Metodo para saber el tamaño de la pila
    public int tamañoPila(){
        return tamaño;
    }
    
    //metodo para limpiar la pila
    public void LimpiarPila(){
        while(!PilaVacia()){
            SacarElemento();
        }
    }
}
