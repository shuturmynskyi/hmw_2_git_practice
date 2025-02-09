package HMW_6.mainapp;

import HMW_6.Horsе_and_Pegas.Pegas;
import HMW_6.Horsе_and_Pegas.Horse;
import HMW_6.Domestic_animals.Cat;
import HMW_6.Domestic_animals.Dog;
import HMW_6.Village.*;

public class Main {
    public static void main(String[] args) {
        // Test Horse and Pegas
        System.out.println("=== Fantasy Animals ===");
        Horse horse = new Horse();
        horse.run();

        Pegas pegas = new Pegas();
        pegas.run();  // Method inherited from Horse
        pegas.fly();  // Specific method of Pegas

        // Test Domestic Animals
        System.out.println("\n=== Domestic Animals ===");
        Cat cat = new Cat();
        cat.eat();   // Method inherited from Pet
        cat.meow();  // Specific method of Cat

        Dog dog = new Dog();
        dog.eat();   // Method inherited from Pet
        dog.bark();  // Specific method of Dog

        // Test Village Animals
        System.out.println("\n=== Village Animals ===");
        Cow cow = new Cow();
        cow.makeSound();  // Method inherited from Animal
        cow.moo();        // Specific method of Cow

        Pig pig = new Pig();
        pig.makeSound();
        pig.oink();

        Sheep sheep = new Sheep();
        sheep.makeSound();
        sheep.baa();

        Bull bull = new Bull();
        bull.makeSound();
        bull.roar();

        Goat goat = new Goat();
        goat.makeSound();
        goat.bleat();
    }
}
