package HMW_6.Encapsulation;

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
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("The value cannot be less than 0");
        }
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (age > 0) {
            this.weight = weight;
        } else {
            System.out.println("The value cannot be less than 0");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
