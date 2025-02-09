package guard;

public class Gun {

    private String model;

    public Gun(String model) {
        this.model = model;
    }

    public void shoot(Attacker attacker) {
        System.out.println("Shoot attacker");
        System.out.println(attacker.getName() + "was shoot via " + model);
    }
}
