package HMW_4;

public class MultiplicationTable {
    /*
    Print to console multiplication table 10*10
    using while loop
    numbers are divided with space " "

    Example output:
    1  2  3  4  5  6  7  8  9 10
    2  4  6  8 10 12 14 16 18 20
    3  6  9 12 15 18 21 24 27 30
     */

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}