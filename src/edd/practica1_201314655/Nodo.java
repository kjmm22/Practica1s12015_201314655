package edd.practica1_201314655;

public class Nodo {
    
    private Nodo nodo;
    private Object dato;
    
    public Nodo(){
        dato = null;
        Nodo nodo = null;
    }    
        
    public Nodo(Object dato){
        this();
        this.dato=dato;
    }
    
    public void setDato(Object dato){
        this.dato = dato;
    }
 
    public Object getDato(){
        return dato;
    }

    public void setNodo(Nodo nodo){
        this.nodo = nodo;
    }
 
    public Nodo getNodo(){
        return nodo;
    } 
}
