package HMW_5;

public class CatsFight {
    public static void main(String[] args) {
        Cat0 cat1 = new Cat0("Barsik", 3, 5);  // ім'я, вік, вага
        Cat0 cat2 = new Cat0("Murka", 4, 5);
        Cat0 cat3 = new Cat0("Pushok", 2, 4);


//        System.out.println("Barsik vs Murka: " + cat1.fight(cat2));
//        System.out.println("Murka vs Pushok: " + cat2.fight(cat3));
//        System.out.println("Pushok vs Barsik: " + cat3.fight(cat1));

        fightResult(cat1, cat2);
        fightResult(cat2, cat3);
        fightResult(cat3, cat1);

        System.out.println();
        System.out.println("Результати чемпіонату:");
        System.out.println(cat1.getName() + ": " + cat1.getWins() + " перемог");
        System.out.println(cat2.getName() + ": " + cat2.getWins() + " перемог");
        System.out.println(cat3.getName() + ": " + cat3.getWins() + " перемог");

        // Визначаємо переможця
        Cat0 champion = cat1;
        if (cat2.getWins() > champion.getWins()) {
            champion = cat2;
        }
        if (cat3.getWins() > champion.getWins()) {
            champion = cat3;
        }

        System.out.println();
        System.out.println("🏆 Переможець чемпіонату: " + champion.getName() + " з " + champion.getWins() + " перемогами!");

    }

    public static void fightResult(Cat0 catA, Cat0 catB) {
        if (catA.fight(catB)) {
            System.out.println(catA.getName() + " переміг " + catB.getName());
            catA.addWin();
        } else {
            System.out.println(catB.getName() + " переміг " + catA.getName());
            catB.addWin();
        }
    }
}


