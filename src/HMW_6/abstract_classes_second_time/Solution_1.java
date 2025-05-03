package HMW_6.abstract_classes_second_time;

public class Solution_1 {
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
            return "Cow";
        }
    }

    public static void main(String[] args) {
        Animal cow = new Cow();
        cow.getName();
    }

}
