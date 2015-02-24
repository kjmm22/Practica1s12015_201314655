package edd.practica1_201314655;


public class Cola {
    Node first;
    Node end;
    int size;
    
    class Node{
     Object elemento;
     Node Next;
     
     public Node(Object o){
         elemento=0;
         Next=null;
     }     
    }
    
    public Cola(){
      end=null;
      size=0;
    }
    
    public void Encolar(Object o){
        Node nuevoNodo = new Node(o);
        if(first==null){
            first=nuevoNodo;
            end=nuevoNodo;
        } 
        else {
            end.Next = nuevoNodo;
            end = nuevoNodo;
        }
        size++;
    }
    
    public Object Desencolar(){
        if (first == null){
        return null;
        }
        
        Object o = first.elemento;
        first = first.Next;
        size--;
        return o;
    }
    
    public boolean isEmpty() {
    return (size == 0);
    }
    
    public int size() {
    return size;
    }
    
    public Object first() {
    if (first == null)
      return null;
    else
      return first.elemento;
    }



        
}
