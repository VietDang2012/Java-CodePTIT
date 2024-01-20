package J05010;
// May tinh SONY VAIO

// Dien tu

// 16400

// 17699
public class Product {
    private String name, type;
    private int id;
    private double sellPrice, buyPrice, profit;
    private static int cnt = 0;

    public Product() {
    }

    public Product(String name, String type, double buyPrice, double sellPrice) {
        this.name = name;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.id = ++cnt;
        this.profit = sellPrice - buyPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        String res = String.format("%d %s %s %.02f", this.id, name, type, profit);
        return res;
    }
}
