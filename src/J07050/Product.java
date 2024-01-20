package J07050;

public class Product implements Comparable<Product> {
    private String id, name, type;
    private double iprice, sprice, profit;
    private static int cnt = 0;

    public Product() {
    }

    public Product(String name, String type, double iprice, double sprice) {
        this.id = String.format("MH%02d", ++cnt);
        this.name = name;
        this.type = type;
        this.iprice = iprice;
        this.sprice = sprice;
        this.profit = sprice - iprice;
    }

    public double getIprice() {
        return iprice;
    }

    public double getSprice() {
        return sprice;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", id, name, type, profit);
    }

    @Override
    public int compareTo(Product other) {
        return (int) (Math.round(other.profit) - Math.round(this.profit));
    }
}
