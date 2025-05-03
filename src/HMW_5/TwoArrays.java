package HMW_5;

import java.util.Scanner;

public class TwoArrays {
    /*
    1. Create an Array of Strings, size 10
    2. Create an Array of int, size 10
    3. Read from the console and fill in the Array with Strings
    4. Fill in the int Array with length of Strings from the first Array.
        If the first element contains "Hello", we put in the first element of int Array - 5
    5. Print the int Array to the console
     */

    public static void main(String[] args) {
        String [] array_of_Str = new String[10];
        int [] array_of_int = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Strings: ");
        for (int i = 0; i < array_of_Str.length; i++) {
            array_of_Str[i] = scanner.nextLine();
        }
        for (int i = 0; i < array_of_Str.length; i++) {
            array_of_int[i] = array_of_Str[i].length();
        }
        System.out.println("Lengths of Strings: ");
        for (int i : array_of_int) {
            System.out.print(i + " ");
        }



    }


}
