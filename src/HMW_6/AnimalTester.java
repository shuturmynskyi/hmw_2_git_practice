package HMW_6;

import HMW_6.Village_second_time.*;

public class AnimalTester {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cow(),
                new Pig(),
                new Sheep(),
                new Bull(),
                new Goat()
        };

        for (Animal animal : animals) {
            animal.makeSound(); // Кожна тварина видає свій звук!
        }
    }

}
