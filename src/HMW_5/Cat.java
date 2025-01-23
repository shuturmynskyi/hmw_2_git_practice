package HMW_5;

public class Cat {
    private String name;
    private int age;
    private int weight;

    // Конструктор
    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Гетери
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    // Сетери
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // 2.1. Метод fight
    public boolean fight(Cat anotherCat) {
        // Формула "бойового показника" (чим більше, тим сильніший кіт)
        int myScore = (this.weight * 2) + this.age;
        int otherScore = (anotherCat.weight * 2) + anotherCat.age;

        // Якщо бойовий показник this вище - перемагає, інакше - програє
        return myScore > otherScore;
    }
}
