package HMW_6.Interfaces;

public class Athlete extends Solution4.Human {
    @Override
    public void run() {
        System.out.println("Athlete is running.");
    }

    @Override
    public void swim() {
        System.out.println("Athlete is swimming.");
    }
}
