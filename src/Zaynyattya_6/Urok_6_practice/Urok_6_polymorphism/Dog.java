package Zaynyattya_6.Urok_6_practice.Urok_6_polymorphism;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("No, I`m a dog");
    }
}
