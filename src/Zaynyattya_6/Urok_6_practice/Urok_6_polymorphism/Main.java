package Zaynyattya_6.Urok_6_practice.Urok_6_polymorphism;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Pat");
        Cat cat = new Cat("Vasya");
        Dog dog = new Dog("Bim");
        Cow cow = new Cow("Milka");

        cat.speak();
        dog.speak();
        cow.speak();

    }
}
