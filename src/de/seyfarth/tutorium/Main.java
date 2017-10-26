package de.seyfarth.tutorium;

public class Main {

    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty");
        Cat nyan = new Cat("Nyan");
        Dog hasso = new Dog("Hasso");
        kitty.demandFood();
        kitty.eat();
        kitty.roam();
        nyan.scratch();
        nyan.purr();
        nyan.sleep();
        hasso.begForFood();
        hasso.takeMeForAWalk();
        hasso.bite();
    }
}
