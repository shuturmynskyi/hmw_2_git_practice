package HMW_5;

public class Cat3 {
    private static int catsCount = 0; // Статичне поле

    public static void setCatsCount(int catsCount) {
        Cat3.catsCount = catsCount;
    }
    public static int getCatsCount() {
        return catsCount;
    }
}

