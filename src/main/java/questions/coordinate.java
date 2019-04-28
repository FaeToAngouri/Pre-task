package questions;

public class coordinate extends Object{
    private int x;
    private int y;

    public coordinate(int a, int b) {
        this.x = a;
        this.y = b;
    }

    @Override
    public String toString() {
        String s = Integer.toString(x);
        String t = Integer.toString(y);
        return ("(" + s + ", " + t + ")");
    }

}
