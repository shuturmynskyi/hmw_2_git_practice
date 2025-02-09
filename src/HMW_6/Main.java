package HMW_6;

public class Main {
    public static void main(String[] args) {
        Cat1 cat = new Cat1();

        cat.setName("Боря");
        cat.setAge(3);
        cat.setWeight(4);
        cat.setColor("Білий");

        System.out.println("Ім'я кота: " + cat.getName());
        System.out.println("Вік кота: " + cat.getAge());
        System.out.println("Вага кота: " + cat.getWeight());
        System.out.println("Колір кота: " + cat.getColor());

        // Перевірка з некоректними даними
        cat.setAge(-1);  // Виведе повідомлення про помилку
    }
}
