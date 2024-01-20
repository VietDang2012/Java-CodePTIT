package J05053;

public class Order {
    private String name, orderCode;
    private int orderNumber, quantity;
    private double unitPrice;

    public Order(String name, String orderCode, double unitPrice, int quantity) {
        this.name = name;
        this.orderCode = orderCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.orderNumber = Integer.parseInt(orderCode.substring(1, 4));
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double calculateDiscount() {
        if (orderCode.charAt(4) == '1') {
            return 0.5 * unitPrice * quantity;
        } else {
            return 0.3 * unitPrice * quantity;
        }
    }

    public double calculateTotalPrice() {
        return unitPrice * quantity - calculateDiscount();
    }

    @Override
    public String toString() {
        return name + " " + orderCode + " " + String.format("%03d", orderNumber) + " " +
                String.format("%.0f", calculateDiscount()) + " " + String.format("%.0f", calculateTotalPrice());
    }
}