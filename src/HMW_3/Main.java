package HMW_3;

public class Main {
    public static void main(String[] args) {
        printMessage("Hello!");
        printSum(2, 3);
    }


    public static void printMessage(String s) {
        System.out.println(s);
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);;
    }
}







//Create public static void main(String[] args) method
//Create public static void printMessage(String s) method, which receives String object and prints this object to the console;
//Create public static void printSum(int a, int b) method, which receives 2 integers and print the sum of them to the console;
//Call both methods from the main method