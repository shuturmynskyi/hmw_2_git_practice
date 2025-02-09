package guard;

public class Attacker {
    public Attacker(boolean hasGun, String name) {
        this.hasGun = hasGun;
        this.name = name;
    }

    private String name;
    private boolean hasGun;

    public String getName() {
        return name;
    }

    public boolean hasGun() {
        return hasGun;
    }
}
