package HMW_4;

import java.util.Scanner;
public class PrintStringNTimes {
    /*
    Enter from the console a string and a number
    Print string n times
    using loop while
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println( "Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        //Implement here
        int i = 0;
        while (i < n) {
            System.out.println(s);
            i++;
        }


    }
}