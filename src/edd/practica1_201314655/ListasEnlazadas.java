
package edd.practica1_201314655;


public class ListasEnlazadas {
    
    private Nodo cabecera;
    private int tamaño;
    
    public ListasEnlazadas(){
        tamaño=0;
        cabecera= new Nodo();
    }
    
    public int getTamaño(){
    return tamaño;
    }
    
    private Nodo getUltimoNodo(){
        Nodo nodoUltimo = null;
        if(cabecera != null){
            nodoUltimo = cabecera;
            while(nodoUltimo.getNodo() != null){
                nodoUltimo = nodoUltimo.getNodo();
            }
        }
    return nodoUltimo;
    } 
    
    public boolean addDato(Object dato){
        Nodo nodoUltimo = getUltimoNodo();
        if(dato != null && nodoUltimo != null){
            nodoUltimo.setNodo(new Nodo(dato));
            tamaño ++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public Object getDato(int pos){
        Nodo nodoUltimo = null;
        int contador = 0;
        Object dato = null;
  
        if(cabecera != null){
            nodoUltimo = cabecera;
            do{
            nodoUltimo = nodoUltimo.getNodo();
                if(contador == pos){
                    dato = nodoUltimo.getDato();
                    break;
                }
                else{
                    contador++;
                }   
            }
            while(nodoUltimo.getNodo() != null);
        }
        return dato;
    }
}
    
