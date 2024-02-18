package domain;

import java.util.PriorityQueue;

public class Shop {
    private final PriorityQueue<Toy> toys;

    public Shop() {
        this.toys = new PriorityQueue<>(new ToysComparator());
    }

    public void addToy(Toy toy) {
        this.toys.add(toy);
    }

    public Toy getToy() {
        Toy toy = this.toys.poll();

        if (toy != null) {
            toy.setWeight(toy.getWeight() - 1);
        }

        if (toy != null && toy.getWeight() > 0) {
            this.toys.add(toy);
        }

        return toy;
    }
}
