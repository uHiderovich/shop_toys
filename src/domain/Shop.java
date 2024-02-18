package domain;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Random;

public class Shop {
    private final PriorityQueue<Integer> toysIds;
    private HashMap<Integer, Toy> toysById;
    private Random random;

    public Shop() {
        this.toysIds = new PriorityQueue<>();
        this.toysById = new HashMap<>();
        this.random = new Random();
    }

    public void putToy(Toy toy) {
        for (int i = 0; i < toy.getFrequency(); i++) {
            toysIds.add(toy.getId());
        }
        toysById.put(toy.getId(), toy);
    }

    public Toy getToy() {
        int randomIndex = random.nextInt(toysIds.size());
        int currentIndex = 0;

        for (int id : toysIds) {
            if (currentIndex == randomIndex) {
                toysIds.remove(id);
                return toysById.get(id);
            }
            currentIndex++;
        }

        return null;
    }
}
