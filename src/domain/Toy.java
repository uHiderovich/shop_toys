package domain;

public class Toy {
    private final int id;
    private final String name;
    private final int frequency;

    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public String toString() {
        return this.id + " " + this.name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }
}
