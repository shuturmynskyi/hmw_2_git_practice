package HMW_6.abstract_classes;

public class Solution2 {
    /*
    Extend classes Cat and Dog from Pet
    Implement all the necessary methods
    Classes Cat and Dog should not be abstract
     */

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Cat";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public String getName() {
            return "Dog";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }

    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();

        System.out.println(cat.getName());        // Виведе: Cat
        System.out.println(dog.getName());        // Виведе: Dog
        System.out.println(cat.getChild().getName());  // Виведе: Cat
        System.out.println(dog.getChild().getName());  // Виведе: Dog
    }
}