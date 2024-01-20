package J05052;

public class Order {
    private String name, orderCode;
    private double unitPrice;
    private int quantity;

    public Order(String name, String orderCode, double unitPrice, int quantity) {
        this.name = name;
        this.orderCode = orderCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calculateDiscount() {
        if (orderCode.charAt(4) == '1') {
            return 0.5 * unitPrice * quantity;
        } else if (orderCode.charAt(4) == '2') {
            return 0.3 * unitPrice * quantity;
        }
        return 0;
    }

    @Override
    public String toString() {
        double discount = calculateDiscount();
        return String.format("%s %s %03d %.0f %.0f%n", name, orderCode, Integer.parseInt(orderCode.substring(1, 4)),
                discount, unitPrice * quantity - discount);
    }
}
