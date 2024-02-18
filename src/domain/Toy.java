package domain;

public class Toy {
    private final String id;
    private final String name;
    private Integer weight;

    public Toy(String id, String name, Integer weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return this.id + " " + this.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
