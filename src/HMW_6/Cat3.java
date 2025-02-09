package HMW_6;

public class Cat3 {

    /*
    Close access to all internal variables
    and methods that allow changing internal state objects of class Cat.
    */

    private String name;
    private int age;
    private int weight;
    private String color;

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    private void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ім'я не може бути порожнім.");
        }
    }

    private void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Вік не може бути від'ємним.");
        }
    }
}
