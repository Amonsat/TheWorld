package ua.com.websat.theworld;

/**
 * Created by Sat on 17.10.2014.
 */
public class Creature extends Entity {
    public Creature(Square square) {
        super(square);
//        System.out.println(Integer.toString(this.getId()));
    }
    public Creature(Square square, int x, int y) {
        super(square, x, y);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
