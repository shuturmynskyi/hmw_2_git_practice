package HMW_6.Interfaces;

public class Solution3 {
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

    // Dog implements Move and Eat
    public static class Dog implements Move, Eat {
        @Override
        public void move() {
            System.out.println("Dog is running.");
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }
    }

    // Car implements Move
    public static class Car implements Move {
        @Override
        public void move() {
            System.out.println("Car is moving.");
        }
    }

    // Duck implements Fly, Move, and Eat
    public static class Duck implements Fly, Move, Eat {
        @Override
        public void fly() {
            System.out.println("Duck is flying.");
        }

        @Override
        public void move() {
            System.out.println("Duck is walking.");
        }

        @Override
        public void eat() {
            System.out.println("Duck is eating.");
        }
    }

    // Airplane implements Fly and Move
    public static class Airplane implements Fly, Move {
        @Override
        public void fly() {
            System.out.println("Airplane is flying.");
        }

        @Override
        public void move() {
            System.out.println("Airplane is moving on the runway.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.eat();

        Car car = new Car();
        car.move();

        Duck duck = new Duck();
        duck.fly();
        duck.move();
        duck.eat();

        Airplane airplane = new Airplane();
        airplane.fly();
        airplane.move();
    }
}