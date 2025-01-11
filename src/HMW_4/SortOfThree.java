package HMW_4;
import java.util.Scanner;


public class SortOfThree {
    /*
    Enter and reed three numbers from the console
    Implement method which prints them from highest to lowest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        printFromHighestToLowest(one, two, three);
        scanner.close();
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        if (a>b && a>c) {
            if (b>c) {
                System.out.println("From highest to lowest: " + a + " " + b + " " + c);
            }
            else {
                System.out.println("From highest to lowest: " + a + " " + c + " " + b);
            }
        }
        if (b>a && b>c) {
            if (a>c) {
                System.out.println("From highest to lowest: " + b + " " + a + " " + c);
            }
            else {
                System.out.println("From highest to lowest: " + b + " " + c + " " + a);
            }
        }
        if (c>a && c>b) {
            if (a>b) {
            System.out.println("From highest to lowest: " + c + " " + a + " " + b);
        }
        else {
            System.out.println("From highest to lowest: " + c + " " + b + " " + a);
        }
        }

    }
}
