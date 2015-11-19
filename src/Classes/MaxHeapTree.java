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
import java.util.Scanner;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Class BinaryHeap *
 */
public class MaxHeapTree {

    private Lista_Canciones Heap = new Lista_Canciones();
    public int size = 0;
    private int maxsize = 100;

    private static final int FRONT = 1;

    public MaxHeapTree(Cancion cancion) {
        this.maxsize = maxsize;
        
        Heap.insert(cancion, size);
        size++;
        Heap.setSize(size);
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        Cancion tmp;
        tmp = Heap.get(fpos);
        Heap.delete(fpos);
        Heap.insert(Heap.get(spos), fpos);
        Heap.delete(spos);
        Heap.insert(tmp, spos);

    }

    private void maxHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (Heap.get(pos).getPriority() < Heap.get(leftChild(pos)).getPriority() || Heap.get(pos).getPriority() < Heap.get(rightChild(pos)).getPriority()) {
                if (Heap.get(leftChild(pos)).getPriority() > Heap.get(rightChild(pos)).getPriority()) {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(Cancion element) {
        Heap.insert(element, size);
        size++;
        int current = size-1;

        while (Heap.get(current).getPriority() > Heap.get(parent(current)).getPriority()) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

 

    public void maxHeap() {
        for (int pos = (size / 2); pos >= 1; pos--) {
            maxHeapify(pos);
        }
    }

    public Cancion remove() {
        Cancion popped = Heap.get(FRONT);
        Heap.delete(FRONT);
        Heap.insert(Heap.get(size), FRONT);
        maxHeapify(FRONT);
        return popped;
        
    }
    public Lista_Canciones retHeap(){
        return Heap;
    }
}
