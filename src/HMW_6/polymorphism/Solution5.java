package HMW_6.polymorphism;

    /* "Cow" or "Whale" or "Dog" or "Unknown animal"
    Implement method, that defines, the type of object which class was passed,
    And return the result – one of the strings: "Cow", "Whale", "Dog", "Unknown animal".
    */

public class Solution5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o == null) {
            return "Unknown animal";  // Якщо об'єкт null
        }
        return o.getClass().getSimpleName();
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
