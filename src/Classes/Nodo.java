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
public class Nodo {
    int value = 0;
    Nodo next;

    public Nodo(int value){
        this.value=value;
    }
    
    public Nodo(){
        
    }
            

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }  
}
