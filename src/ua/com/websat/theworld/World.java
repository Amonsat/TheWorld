package ua.com.websat.theworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Sat on 17.10.2014.
 */
public class World {
    private final static int DEFAULT_SIZE = 1; // in SQUARE
    private final static int CREATURES_ON_SQUARE = 10;
    private int size;
    private final List<Creature> creatures = new ArrayList<Creature>();
    private Square[] square;

    public World(int size) {
        this.size = size;
        this.square = new Square[size];
        for(int i = 0; i < size; i++) this.square[i] = new Square();
        this.populateWorld();
    }
    public World() {
        this(DEFAULT_SIZE);
    };

    private void populateWorld() {
        for (int i = 0; i < this.size * CREATURES_ON_SQUARE; i++) {
            Random random = new Random();

            this.creatures.add(new Creature(square[0], random.nextInt(100), random.nextInt(100)));
            System.out.println(this.creatures.get(i).toString());
        }
    }
}
