package HMW_6.polymorphism_second_time;

    /* "Cow" or "Whale" or "Dog" or "Unknown animal"
    Implement method, that defines, the type of object which class was passed,
    And return the result – one of the strings: "Cow", "Whale", "Dog", "Unknown animal".
    */

public class Solution_5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String result = "";
        if (o instanceof Cow) {
            result = "Cow";
        } else if (o instanceof Dog) {
            result = "Dog";
        } else if (o instanceof Whale) {
            result = "Whale";
        } else if (o instanceof Pig) {
            result = "Pig";
        } else {
            result = "Unknown animal";
        }
        return result;
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

