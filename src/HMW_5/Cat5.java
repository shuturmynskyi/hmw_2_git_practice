package HMW_5;

public class Cat5 {
    private static int catCount = 0;

    // Конструктор класу Cat5
    public Cat5() {
        catCount++; // Інкрементуємо лічильник при створенні кожного нового об'єкта
    }

    public static void main(String[] args) {
        Cat5 cat1 = new Cat5(); // Перший кіт, catCount стає 1
        Cat5 cat2 = new Cat5(); // Другий кіт, catCount стає 2

        // Виводимо поточну кількість котів
        System.out.println("Cats count is: " + Cat5.catCount); // Має вивести 2
    }
}
