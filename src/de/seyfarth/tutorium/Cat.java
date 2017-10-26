package de.seyfarth.tutorium;

public class Cat {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void demandFood() {
        System.out.println(name + ": You shall give me food, owner! Or else...");
        System.out.println("Owner: Here is your food, " + name + ".");
    }

    public void eat() {
        System.out.println(name + ": Omnomnom!");
    }

    public void sleep() {
        System.out.println(name + ": Zzz...");
    }

    public void scratch() {
        System.out.println("Owner: Don't scratch, " + name + "!");
    }

    public void roam() {
        System.out.println(name + ": It's nice out here.");
    }

    public void purr() {
        System.out.println(name + ": Miau!");
    }
}
