package HMW_6.abstract_classes_second_time;

public class Solution_2 {
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
}

