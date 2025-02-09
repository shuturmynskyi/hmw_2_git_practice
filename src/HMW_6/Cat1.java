package HMW_6;

public class Cat1 {

    //Close access to all internal variables of the class

    private String name;
    private int age;
    private int weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ім'я не може бути порожнім.");
        }
    }

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

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Колір не може бути порожнім.");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вага повинна бути більшою за 0.");
        }
    }
}