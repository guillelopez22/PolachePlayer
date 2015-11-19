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
public class Lista_Canciones {
    Nodo_Canciones head;
    private int size = 0;

    public Lista_Canciones() {
        head = new Nodo_Canciones();
    }

    public void insert(Cancion value, int pos) {
        Nodo_Canciones newNodo = new Nodo_Canciones(value);
        Nodo_Canciones newHead = head;
        int cont = 0;
        if (pos == 0) {
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext() != null) {
            newHead = newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo_Canciones n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo_Canciones head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public Cancion get(int pos) {
        Nodo_Canciones temp = head;
        Cancion valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();

        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_Canciones temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_Canciones temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Cancion first() {
        return head.getValue();
    }

    public void Print_Lista_Canciones() {
        Nodo_Canciones temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getValue() + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}
