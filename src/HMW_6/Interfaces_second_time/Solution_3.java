package HMW_6.Interfaces_second_time;

public class Solution_3 {
    /*
    There are interfaces Fly, Move, Eat.
    Add proper interfaces to the classes: Dog, Car, Duck, Airplane
     */

    interface Fly {
        void fly();
    }

    interface Move {
        void move();
    }

    interface Eat {
        void eat();
    }

    public static class Dog implements Move, Eat {
        public void move() {
            System.out.println("Dog runs");
        }

        public void eat() {
            System.out.println("Dog eats");
        }
    }

    public static class Car implements Move {
        public void move() {
            System.out.println("Car drives");
        }
    }

    public static class Duck implements Fly, Move, Eat {
        public void fly() {
            System.out.println("Duck flies");
        }

        public void move() {
            System.out.println("Duck walks");
        }

        public void eat() {
            System.out.println("Duck eats");
        }
    }

    public static class Airplane implements Fly, Move {
        public void fly() {
            System.out.println("Airplane flies");
        }

        public void move() {
            System.out.println("Airplane taxis");
        }
    }
}
