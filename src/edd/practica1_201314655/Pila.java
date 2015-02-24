package edd.practica1_201314655;


public class Pila {
    Node end;
    int size;
    
    class Node {
        Object elemento;
        Node Next;

        public Node(Object o) {
        elemento = o;
        Next = null;
        }
    }
    
    public Pila() {
    end = null;
    size = 0;
    }

    
    public void Apliar(Object o) {
    Node nuevoNodo = new Node(o);
    if (end == null)
      end = nuevoNodo;
    else {
      nuevoNodo.Next = end;
      end = nuevoNodo;
    }
    size++;
  }; // inserts an object onto the stack

    public Object Desapilar() {
        if (end == null){
        return null;
        }
    
        Object o = end.elemento;
        end = end.Next;
        size--;
        return o;
    }// Gets the object from the stack

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public Object Cima() {
        if (end == null)
            return null;
        else
            return end.elemento;
    }

}
