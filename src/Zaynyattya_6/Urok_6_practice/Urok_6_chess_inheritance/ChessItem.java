package Zaynyattya_6.Urok_6_practice.Urok_6_chess_inheritance;

public abstract class ChessItem implements  Drawable, Element {
    private int x;
    private int y;
    private int value;
    private int worth;

    public int getValue(){
        return value;
    };

    public void setX(int x) {
        if (x < 0 || x > 10) {
            System.out.println("You can`t");
        }
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public int getWorth() {
        return worth;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public abstract void move();
}
