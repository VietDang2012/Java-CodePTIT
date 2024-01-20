package J07037;

public class Enterprise implements Comparable<Enterprise> {
    private String id, name, amount;

    public Enterprise() {
    }

    public Enterprise(String id, String name, String amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, name, amount);
    }

    @Override
    public int compareTo(Enterprise other) {
        return this.id.compareTo(other.id);
    }
}
