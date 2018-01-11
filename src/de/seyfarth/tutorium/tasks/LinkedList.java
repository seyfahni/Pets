package de.seyfarth.tutorium.tasks;

import de.seyfarth.tutorium.debugging.ChainPart;

public class LinkedList {
   
    private ChainPart first;
    
    public LinkedList(){
        
    }
    
    public int size(){
        ChainPart current = this.first;
        int size = 0;
        while (current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }
    
    public boolean add(int index, Object element){
        if(this.first == null){
            this.first = new ChainPart(element);
        } else {
            ChainPart current = this.first;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new ChainPart(element));
        }
        return true;
    }
    
    public boolean remove(int index){
        ChainPart current = this.first;
        return true;
    }
    
    
    
    
}
