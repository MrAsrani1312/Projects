package com.hitarth;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal a = new Animal("Cheetah",1,1,1,50);

        Dog dog = new Dog("Husky", 10, 25, 1,2,2,1,"Long");
        dog.eat();
        dog.run();
        dog.walk();
    }
}
