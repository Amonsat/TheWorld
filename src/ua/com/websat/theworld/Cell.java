package ua.com.websat.theworld;

/**
 * Created by Sat on 17.10.2014.
 */
public class Cell {
    private Entity entity;

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
    public Entity getEntity() {
        return this.entity;
    }

    public boolean isBusy(int x, int y) {
        Coordinates coordinates = this.entity.getCoordinates();
        return coordinates.getX() == x & coordinates.getY() == y;
    }
}
