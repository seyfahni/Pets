package de.seyfarth.tutorium.chain;

public class ChainTest {

    public static void main(String[] args) {
        ChainPart first;
        
        first = new ChainPart("erstes");
        first.setNext(new ChainPart("second"));
        first.getNext().setNext(new ChainPart("third"));
        
        
        Chain chain = new Chain();
        chain.append("erstes");
        chain.append("second");
        chain.append("third");
        chain.append("forth");
        
        System.out.println(chain.get(3));
        
        
        for (Object element : chain) {
            System.out.println(element);
        }
        
        
    }
    
}
