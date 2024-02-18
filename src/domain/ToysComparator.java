package domain;

public class ToysComparator implements java.util.Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o2.getWeight() - o1.getWeight();
    }
}
