package Zaynyattya_6.Urok_6_practice.Urok_6_polymorphism;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("I`m a Cat");
    }

//    public void tellMe(){
//        this.tellMe("Hey, I`m a cat");
//    }
//
//    public void tellMe(String message) {
//        System.out.println("Hey, this is Cat class");
//    }
//
//    public static void main(String[] args) {
//        Cat cat = new Cat("Murka");
//        cat.tellMe();
//    }
}
