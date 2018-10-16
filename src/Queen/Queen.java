package Queen;
public class Queen {

    int x;
    int y;


    public Queen(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void print() {
        System.out.print("(" + x + ", " + y + "); ");
    }

}
