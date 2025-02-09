package guard;

public class AikidoArt implements MartialArts{
    @Override
    public void fight(Attacker attacker) {
        System.out.println("Hey, " + attacker.getName());
        System.out.println("You are dead man. I`m attacking you with my Aikido");

    }
}
