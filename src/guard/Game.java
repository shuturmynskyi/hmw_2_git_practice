package guard;

public class Game {
    public static void main(String[] args) {
        Attacker ivan = new Attacker(false, "Ivan");
        Attacker petr = new Attacker(true, "Petr");

        BodyGuard aleksii = new BodyGuardGuy("aleksii", new Gun("Colt"), new AikidoArt());
        aleksii.saveClientLife(ivan);

        System.out.println("/////////////////////");

        BodyGuard andrii = new BodyGuardGuy("andrii", new Gun("Magnum"), new KarateArt());
        andrii.saveClientLife(petr);

    }
}
