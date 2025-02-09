package HMW_6.abstract_classes;

public class Solution1 {
    /*
    Extend class Cow from animal
    implement all the necessary methods
     */

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Cow";  // Реалізація методу getName()
        }
    }

    public static void main(String[] args) {
        Animal cow = new Cow();
        System.out.println(cow.getName());  // Виведе: Cow
    }
}