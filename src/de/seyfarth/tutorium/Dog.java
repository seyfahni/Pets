package de.seyfarth.tutorium;

public class Dog {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void begForFood() {
        System.out.println(name + ": Could you spare some food for me?");
        System.out.println("Owner: Sit! You get your food later, " + name + ".");
    }

    public void eat() {
        System.out.println(name + ": Hamnamnam!");
    }

    public void sleep() {
        System.out.println(name + ": Chrrrr...");
    }

    public void bite() {
        System.out.println("Enemy: Ahhhh!!");
    }

    public void takeMeForAWalk() {
        System.out.println(name + ": There is a stick flying! I can catch it!");
        System.out.println("Owner: Nice catch, " + name + "!");
    }

    public void bark() {
        System.out.println(name + ": Wuff!");
    }
}
