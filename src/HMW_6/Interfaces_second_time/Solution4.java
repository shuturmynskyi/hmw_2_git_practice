package HMW_6.Interfaces_second_time;

public class Solution4 {

    /*
    Create class Human
    Create interfaces Run, Swim
    Add 1 method to each interface
    Add these interfaces to class Human without method implementation
    Create Human class as abstract
     */

    interface Run {
        void run();
    }

    interface Swim {
        void swim();
    }

    public abstract static class Human implements Run, Swim {
        // Ми реалізували інтерфейси, але методи не реалізували,
        // тому клас має бути абстрактним
    }


}
