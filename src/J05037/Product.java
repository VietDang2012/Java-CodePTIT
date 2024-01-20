package J05037;

class Product implements Comparable<Product> {
    private static int cnt = 0;
    private int id, quantity;
    private String name, unit;
    private double costPrice;

    public Product(String name, String unit, double costPrice, int quantity) {
        this.id = ++cnt;
        this.name = name;
        this.unit = unit;
        this.costPrice = costPrice;
        this.quantity = quantity;
    }

    public String getId() {
        return "MH" + String.format("%02d", id);
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getShippingFee() {
        return Math.round(costPrice * quantity * 0.05);
    }

    public double getTotalCost() {
        return Math.round(costPrice * quantity + getShippingFee());
    }

    public double getRetailPrice() {
        return Math.ceil((getTotalCost() + 0.02 * getTotalCost()) / quantity / 100) * 100;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(other.getRetailPrice(), this.getRetailPrice());
    }
}