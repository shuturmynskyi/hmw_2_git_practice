package guard;

public class BoxArts implements MartialArts {
    @Override
    public void fight(Attacker attacker) {
        System.out.println("Hey, " + attacker.getName());
        System.out.println("One hook, one death");

    }
}
