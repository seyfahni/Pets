package de.seyfarth.tutorium.tasks;

public class PrePostIncrementDecrementPuzzle {

    public static void main(String[] args) {
        int c = 1;
        
        System.out.println((c++) + (--c + c--));
        
        System.out.println(c);
    }
    
}
