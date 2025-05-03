package HMW_6.polymorphism_second_time;

    /* Cat from the Cat, Dog from the Dog
    Override method getChild in the classes Cat and Dog,
    that cat creates cat, and dog creates dog.
    */

public class Solution_3 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();

        System.out.println(cat.getName()); // I'm cat child
        System.out.println(dog.getName()); // I'm dog child
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }

        public String getName() {
            return "I'm just a pet";
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat(); // Створюємо кота
        }

        @Override
        public String getName() {
            return "I'm cat child";
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return new Dog(); // Створюємо пса
        }

        @Override
        public String getName() {
            return "I'm dog child";
        }

    }


}