package ListaSimplementeEnlazada;

public class Nodo {
    public int dato;
    public Nodo siguiente;//puntero enlace
    
    //constructor para insertar al final
    public Nodo(int d){
        this.dato=d;
        this.siguiente=null;
    }
    //constructor para insertar al inicio
    public Nodo(int d,Nodo n){
        this.dato=d;
        this.siguiente= n;
    }
}
