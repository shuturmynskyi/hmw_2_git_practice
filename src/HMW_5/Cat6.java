package HMW_5;

public class Cat6 {
    String name;
    int weight;
    int age;
    String color;
    String address;

    // Значення за замовчуванням (ви можете змінити на будь-які інші)
    private static final int DEFAULT_WEIGHT = 4;
    private static final int DEFAULT_AGE = 2;
    private static final String DEFAULT_NAME = "Unnamed";
    private static final String DEFAULT_COLOR = "Gray";
    private static final String DEFAULT_ADDRESS = "Homeless";

    // 1. Конструктор: тільки ім’я відоме
    public Cat6(String name) {
        this.name = name == null ? DEFAULT_NAME : name;
        this.weight = DEFAULT_WEIGHT;
        this.age = DEFAULT_AGE;
        this.color = DEFAULT_COLOR;
        this.address = DEFAULT_ADDRESS;
    }

    // 2. Конструктор: ім’я, вага, вік відомі
    public Cat6(String name, int weight, int age) {
        // Якщо name == null, підставимо DEFAULT_NAME, бо не можна залишити null
        this.name = name == null ? DEFAULT_NAME : name;
        // weight і age не можуть бути 0 чи менші
        this.weight = (weight <= 0) ? DEFAULT_WEIGHT : weight;
        this.age = (age <= 0) ? DEFAULT_AGE : age;
        // Колір і адреса невідомі
        this.color = DEFAULT_COLOR;
        this.address = DEFAULT_ADDRESS;
    }

    // 3. Конструктор: ім’я та вік відомі, вага стандартна
    public Cat6(String name, int age) {
        this.name = name == null ? DEFAULT_NAME : name;
        this.age = (age <= 0) ? DEFAULT_AGE : age;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
        this.address = DEFAULT_ADDRESS;
    }

    // 4. Конструктор: вага, колір відомі (кіт безпритульний), ім’я та адреса "невідомі", вік стандартний
    public Cat6(int weight, String color) {
        this.name = DEFAULT_NAME; // Оскільки ім'я невідоме
        this.weight = (weight <= 0) ? DEFAULT_WEIGHT : weight;
        this.age = DEFAULT_AGE;   // Стандартний вік, бо не задався
        this.color = (color == null) ? DEFAULT_COLOR : color;
        this.address = DEFAULT_ADDRESS; // Безпритульний, тобто не має конкретної адреси
    }

    // 5. Конструктор: вага, колір, адреса (ім’я невідоме, вік стандартний)
    public Cat6(int weight, String color, String address) {
        this.name = DEFAULT_NAME; // Ім'я невідоме
        this.weight = (weight <= 0) ? DEFAULT_WEIGHT : weight;
        this.age = DEFAULT_AGE;
        this.color = (color == null) ? DEFAULT_COLOR : color;
        this.address = (address == null) ? DEFAULT_ADDRESS : address;
    }

    public String getInfo() {
        return "Cat info:" +
                "\nName: " + name +
                "\nWeight: " + weight +
                "\nAge: " + age +
                "\nColor: " + color +
                "\nAddress: " + address;
    }

//     Для зручності можна додати методи getInfo або toString
//    public String toString() {
//        return "Cat: name=" + name +
//                ", weight=" + weight +
//                ", age=" + age +
//                ", color=" + color +
//                ", address=" + address;
//    }

}
