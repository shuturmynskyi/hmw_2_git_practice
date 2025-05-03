package HMW_4;
import java.util.Scanner;

public class MaxOfFour {
    /*
    Enter and reed four numbers from the console
    Implement method which prints max of four variable
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        printMaxOfFour(one, two, three, four);
        scanner.close();
    }

    private static void printMaxOfFour(int a, int b, int c, int d) {
        if (a>b && a>c && a>d) {
            System.out.println("Max of 4 is: " + a);
        } else if (b>a && b>c && b>d) {
            System.out.println("Max of 4 is: " + b);
         } else if (c>a && c>b && c>d) {
            System.out.println("Max of 4 is: " + c);
        } else {
            System.out.println("Max of 4 is: " + d);
        }
    }
//    private static void printMaxOfFour(int a, int b, int c, int d) {
//        int max = a;
//        if (b>max) max = b;
//        if (c>max) max = c;
//        if (d>max) max = d;
//        System.out.println("The max is: " + max);
//    }
//
//
//    private static void printMaxOfFour(int a, int b, int c, int d) {
//        int max = Math.max(Math.max(a, b), Math.max(c, d));
//        System.out.println("Max of 4 is: " + max);
//    }


}
