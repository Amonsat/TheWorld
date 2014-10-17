package ua.com.websat.theworld;

/**
 * Created by Sat on 17.10.2014.
 */
public class Square {
    private static final int DEFAULT_SIZE = 100;
    public Cell[][] cell = new Cell[DEFAULT_SIZE][DEFAULT_SIZE];
    private static int suid = 0; // Entity unique identificator
    private final int id;

    public Square() {
        for(int i = 0; i < DEFAULT_SIZE; i++)
            for(int j = 0; j < DEFAULT_SIZE; j++) {
                this.cell[i][j] = new Cell();
            }
        this.suid += 1;
        this.id = this.suid;
    }

    public int getId() {
        return this.id;
    }
}
