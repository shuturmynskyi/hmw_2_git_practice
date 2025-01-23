package HMW_5;

public class Main {
    public static void main(String[] args) {
        // 3.1. Створюємо 3 об'єкти Cat
        Cat cat1 = new Cat("Vasia", 3, 5);     // Ім'я: Vasia, Вік: 3, Вага: 5
        Cat cat2 = new Cat("Simba", 2, 6);   // Ім'я: Simba, Вік: 2, Вага: 6
        Cat cat3 = new Cat("Fedya", 5, 8);// Ім'я: Fedya, Вік: 5, Вага: 8

        // 4. Проводимо 3 поєдинки
        boolean result1 = cat1.fight(cat2);
        boolean result2 = cat1.fight(cat3);
        boolean result3 = cat2.fight(cat3);

        // 5. Виводимо результат кожного бою
        // Бій 1: cat1 vs cat2
        System.out.println(cat1.getName() + " vs " + cat2.getName() + ": " + (result1 ? cat1.getName() + " wins!" : cat2.getName() + " wins!"));

        // Бій 2: cat1 vs cat3
        System.out.println(cat1.getName() + " vs " + cat3.getName() + ": " + (result2 ? cat1.getName() + " wins!" : cat3.getName() + " wins!"));

        // Бій 3: cat2 vs cat3
        System.out.println(cat2.getName() + " vs " + cat3.getName() + ": " + (result3 ? cat2.getName() + " wins!" : cat3.getName() + " wins!"));
    }
}


