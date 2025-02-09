package guard;

public abstract class BodyGuard {

    private Gun gun;
    String name;
    MartialArts martialArts;

    public BodyGuard(String name, Gun gun, MartialArts martialArts) {
        this.name = name;
        this.gun = gun;
        this.martialArts = martialArts;
    }

    public BodyGuard(Gun gun) {
        this.gun = gun;
    }

    private void shoot (Attacker attacker){
        gun.shoot(attacker);
    }
    public void saveClientLife(Attacker attacker){
        if (attacker.hasGun()){
            shoot(attacker);
        } else {
            applyMartialArts(attacker);
        }
    }

    protected abstract void applyMartialArts(Attacker attacker);

    protected String getName() {
        return this.name;
    }


}
