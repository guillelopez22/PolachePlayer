/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author MemoL
 */
public class Nodo_Canciones {
    Cancion value = null;
    Nodo_Canciones next;

    public Nodo_Canciones(Cancion value){
        this.value=value;
    }
    
    public Nodo_Canciones(){
        
    }
            

    public Cancion getValue() {
        return value;
    }

    public void setValue(Cancion value) {
        this.value.setPriority();
    }

    public Nodo_Canciones getNext() {
        return next;
    }

    public void setNext(Nodo_Canciones next) {
        this.next = next;
    }  
}
