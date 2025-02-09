package guard;

public class KarateArt implements  MartialArts{
    @Override
    public void fight(Attacker attacker) {
        System.out.println("Hey, " + attacker.getName());
        System.out.println("Look at me and afraid me");

    }
}
