package ua.com.websat.theworld;

/**
 * Created by Sat on 17.10.2014.
 */
public class Entity {
    private static int euid = 0; // Entity unique identificator
    private final int id;
    private Coordinates coordinates;// = new Coordinates(square, 0, 0);

    public Entity(Square square) {
        this.euid += 1;
        this.id = this.euid;
        this.coordinates = new Coordinates(square, 0, 0);
    }
    public Entity(Square square, int x, int y) {
        this(square);
        this.coordinates.setLocalCoordiantes(x, y);
    }

    public int getId() {
        return this.id;
    }
    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    @Override
    public String toString() {
        return this.getClass()
                + "[square = " + this.coordinates.getSquare().getId()
                + ", x = " + this.coordinates.getX()
                + ", y = " + this.coordinates.getY() + "]";
    }
}
