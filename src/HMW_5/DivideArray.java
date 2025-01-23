package HMW_5;

import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {
        int[] bigArray = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = scanner.nextInt();
        }

        int[] firstHalf = new int[10];
        int[] secondHalf = new int[10];

        for (int i = 0; i < 10; i++) {
            firstHalf[i] = bigArray[i];         // First half
            secondHalf[i] = bigArray[i + 10];  // Second half
        }
        System.out.println("Second half of the array:");
        for (int num : secondHalf) {
            System.out.print(num + " ");
        }
    }
}
