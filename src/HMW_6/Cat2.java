package HMW_6;

public class Cat2 {
    /*
    Close access to all internal variables
    but only for which we can get access through the methods
    */

    private String name;
    private int age;
    int weight;
    private String color;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Вік не може бути від'ємним.");
        }
    }
    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Колір не може бути порожнім.");
        }
    }
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ім'я не може бути порожнім.");
        }
    }

    public String getName() {
        return name;
    }

}
