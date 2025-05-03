package HMW_5;

public class Cat7 {
    String name;
    int weight;
    int age;
    String color;
    String address;

    /*
    Create 5 constructors
    1. Name
    2. Name, weight, age
    3. Name, age. (weight should be standard)
    4. weight, color. (name, address and age are unknown. Cat is homeless)
    5. weight, color, address

    Each constructor should create the valid object.
    For example, if we don't know weight, we should specify some kind of standard weight.
    Because cat cannot weight anything
    The same with age
    But it cannot have name(null) and address(null)
     */

    private static final String DEFAULT_NAME = "Debora";
    private static final int DEFAULT_WEIGHT = 2;
    private static final int DEFAULT_AGE = 2;
    private static final String DEFAULT_COLOR = "Black";
    private static final String DEFAULT_ADDRESS = "Homeless";

    public Cat7 (String name) {
        this.name = name;
        this.weight = DEFAULT_WEIGHT;
        this.age = DEFAULT_AGE;
        this.color = DEFAULT_COLOR;
        this.address = DEFAULT_ADDRESS;
    }

    public Cat7 (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = DEFAULT_COLOR;
        this.address = DEFAULT_ADDRESS;
    }

    public Cat7 (String name, int age) {
        this.name = name;
        this.weight = DEFAULT_WEIGHT;
        this.age = age;
        this.color = DEFAULT_COLOR;
        this.address = DEFAULT_ADDRESS;
    }

    public Cat7 (int weight, String color) {
        this.name = DEFAULT_NAME;
        this.weight = weight;
        this.age = DEFAULT_AGE;
        this.color = color;
        this.address = DEFAULT_ADDRESS;
    }
    public Cat7 (int weight, String color, String address) {
        this.name = DEFAULT_NAME;
        this.weight = weight;
        this.age = DEFAULT_AGE;
        this.color = color;
        this.address = address;
    }

    public String get_info() {
        return "Cat info:" +
                "\nName: " + name +
                "\nWeight: " + weight +
                "\nAge: " + age +
                "\nColor: " + color +
                "\nAddress: " + address;

    }











}
