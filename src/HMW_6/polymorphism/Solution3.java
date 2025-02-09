package HMW_6.polymorphism;

    /* Cat from the Cat, Dog from the Dog
    Override method getChild in the classes Cat and Dog,
    that cat creates cat, and dog creates dog.
    */

public class Solution3 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();
        System.out.println("cat instance: " + (cat instanceof Cat));

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
        System.out.println("dog instance: " + (dog instanceof Dog));
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat();  // Створює новий об'єкт Cat
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return new Dog();  // Створює новий об'єкт Dog
        }
    }
}