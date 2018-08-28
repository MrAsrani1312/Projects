package com.hitarth;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes= eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.tail=tail;
        this.coat=coat;
    }

    private void chew()
    {
        System.out.println("Dog.chew() called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void run()
    {
        System.out.println("Dog.run() called.");
        move(15);
    }
    public void walk()
    {
        System.out.println("Dog.walk() called.");
        move(7);
    }
}
