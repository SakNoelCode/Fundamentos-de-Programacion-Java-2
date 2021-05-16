package ListaSimplementeEnlazada;


public class Lista {

    protected Nodo inicio, fin;  //punteros para saber donde esta el inicio y donde esta el final

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }

    //metodo para agregar un nodo al inicio de la lista
    public void AgregarAlInicio(int elemento) {
        //creando al nodo
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }
    
    //metodo para saber si la lista esta vacia
    public boolean ListaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    //metodo para insertar al final de la lista
    public void AgregarFinal(int elemento){
        if(!ListaVacia()){
            fin.siguiente= new Nodo (elemento);
            fin= fin.siguiente;
        }else{
            inicio= fin= new Nodo(elemento);
        }
    }

    //metodo para mostrar los datos
    public void MostrarLista() {
        Nodo auxiliar = inicio;
        System.out.println();
        while(auxiliar != null){
        System.out.print("[ "+auxiliar.dato+ " ]  ,");
        auxiliar=auxiliar.siguiente;
        }
    }
    
    //metodo para borrar el nodo del inicio 
    public int BorraInicio(){
        int elemento=inicio.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return elemento;
    }
    
    //metodo para borrar el nodo del final
    public int BorrarDelFinal(){
    int elemento=fin.dato;
    if(inicio==fin){
        inicio=fin=null;
    }else{
        Nodo tem = inicio;
        while(tem.siguiente!=fin){
            tem=tem.siguiente;
        }
        fin=tem;
        fin.siguiente=null;
    }
    return elemento;
}
    //Metodo para eliminar un nodo especifico
    public boolean EliminarNodo(int elemento){
        if(!ListaVacia()){
            if(inicio==fin && elemento==inicio.dato){
                inicio=fin=null;
            }else if(elemento==inicio.dato){
                inicio=inicio.siguiente;
            }else{
                Nodo anterior,temporal;
                anterior=inicio;
                temporal=inicio.siguiente;
                while(temporal!=null && temporal.dato != elemento ){
                    anterior= anterior.siguiente;
                    temporal=temporal.siguiente;
                }
                if(temporal != null){
                    anterior.siguiente=temporal.siguiente;
                    if(temporal==fin){
                        fin=anterior;
                    }
                }
            }
        }
        return false;
    }
    
    //Metodo para buscar un elemento
    public boolean BuscarElemento(int elemento){
        Nodo temporal= inicio;
        while(temporal!= null && temporal.dato!= elemento){
            temporal=temporal.siguiente;
        }
        return temporal!= null;
    }
    
    //metodo para ordenar la lista
    public void OrdenarLista(){
        
    }
}
