package de.seyfarth.tutorium.chain;

public class ChainPart {
    private final Object content;
    private ChainPart next;

    public ChainPart(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public ChainPart getNext() {
        return next;
    }

    public void setNext(ChainPart next) {
        this.next = next;
    }
    
    public void append(Object element) {
        if (next == null) {
            next = new ChainPart(element);
        } else {
            next.append(element);
        }
            
    }
}
