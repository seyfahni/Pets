package de.seyfarth.tutorium.tasks;

public class ABPuzzle {

    public static void main(String[] args) {
        A instance = new B();
        System.out.println(B.x);
    }

}

class A {

    public static char x = 'A';
}

class B extends A {

    public static char x = 'B';
}
