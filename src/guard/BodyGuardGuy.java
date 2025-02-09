package guard;

public class BodyGuardGuy extends BodyGuard{


    public BodyGuardGuy(String name, Gun gun, MartialArts martialArts) {
        super(name, gun, martialArts);
    }


    @Override
    protected void applyMartialArts(Attacker attacker) {
        System.out.println("Hey, my name is: " + this.getName());
        martialArts.fight(attacker);
    }

}
