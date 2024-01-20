package J05036;

public class Product {
    private String id, name, unit;
    private double fee, inPrice, outPrice, amount, price;
    private static int cnt = 0;

    public Product() {
    }

    public Product(String name, String unit, double inPrice, double amount) {
        this.name = name;
        this.unit = unit;
        this.inPrice = inPrice;
        this.amount = amount;
        this.id = String.format("MH%02d", ++cnt);
        this.fee = (inPrice * amount) * 5 / 100;
        this.outPrice = inPrice * amount + this.fee;
        this.price = this.outPrice + (this.outPrice * 2 / 100);
    }

    public double getInPrice() {
        return inPrice;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", id, name, unit, Math.round(fee), Math.round(outPrice),
                Math.round(price));
    }
}
