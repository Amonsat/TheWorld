package ua.com.websat.theworld;

/**
 * Created by Sat on 17.10.2014.
 */
public class Coordinates {
    private Square square;
    private int x;
    private int y;

    public Coordinates(Square square, int x, int y) {
        this.setCoordiantes(square, x, y);
    }

    public void setCoordiantes(Square square, int x, int y) {
        this.square = square;
        this.x = x;
        this.y = y;
    }
    public void setLocalCoordiantes(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public Square getSquare() {
        return this.square;
    }
}
