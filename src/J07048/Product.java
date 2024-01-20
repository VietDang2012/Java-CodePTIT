package J07048;

public class Product implements Comparable<Product> {
    private String id, name;
    private int price, date;

    public Product() {
    }

    public Product(String id, String name, int price, int date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", id, name, price, date);
    }

    @Override
    public int compareTo(Product other) {
        if (this.price == other.price) {
            return this.id.compareTo(other.id);
        }
        return other.price - this.price;
    }
}
