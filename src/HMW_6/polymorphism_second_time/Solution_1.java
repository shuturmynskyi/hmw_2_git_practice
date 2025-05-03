package HMW_6.polymorphism_second_time;

public class Solution_1 {


    /* I'm not cow, I'm whale.
    Override method getName in the class Whale, that program prints:
    I'm not cow, I'm whale.
    */

    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm cow";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            // return super.getName();
            return "I'm not a cow! I`m a whale";
        }
    }

}
