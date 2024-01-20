package J05028;

public class Enterprise {
    public String id, name;
    public int amount;

    public Enterprise() {
    }

    public Enterprise(String id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", id, name, amount);
    }
}