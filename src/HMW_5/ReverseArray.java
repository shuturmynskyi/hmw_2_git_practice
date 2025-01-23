package HMW_5;

import java.util.Scanner;

public class ReverseArray {
    /*
    1. Create an Array, of 10 String elements
    2. Input from the console 8 Strings and save them to the array
    3. Print to the console (10 elements) in reverse order. Each element from new line
     */
    public static void main(String[] args) {
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 strings:");
        for (int i = 0; i < 8; i++) { // Тільки перші 8 елементів заповнюємо
            array[i] = scanner.nextLine(); // Зчитуємо рядок із консолі та зберігаємо в масив
        }
        System.out.println("Array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) { // Починаємо з останнього індексу
            System.out.print(array[i] + " "); // Виводимо елемент (включно з null, якщо є)
        }
    }
}