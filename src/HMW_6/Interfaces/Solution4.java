package HMW_6.Interfaces;

public class Solution4 {
    /*
    Create class Human
    Create interfaces Run, Swim
    Add 1 method to each interface
    Add these interfaces to class Human without method implementation
    Create Human class as abstract
    */

    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }

    public abstract static class Human implements Run, Swim {
        // Клас абстрактний, тому методи run() і swim() не реалізовані тут
    }
}
