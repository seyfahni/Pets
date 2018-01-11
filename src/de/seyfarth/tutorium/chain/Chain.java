package de.seyfarth.tutorium.chain;

import java.util.Iterator;

public class Chain implements Iterable<Object> {

    private ChainPart first;

    public Chain() {
    }
    
    public void append(Object element) {
        if (first == null) {
            first = new ChainPart(element);
        } else {
            first.append(element);
        }
    }
    
    public Object get(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        ChainPart current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getContent();
    }
    
    public int size() {
        int size = 0;
        ChainPart current = first;
        while(current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}
