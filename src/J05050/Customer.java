package J05050;

public class Customer {
    private String type, id;
    private int oldIndex, newIndex;
    private static int cnt = 0;

    public Customer(String type, int oldIndex, int newIndex) {
        this.id = String.format("KH%02d", ++cnt);
        this.type = type;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public String getType() {
        return type;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public int calculateCoefficient() {
        switch (type) {
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
            case "CN":
                return 2;
            default:
                return 0;
        }
    }

    public int calculateTotalAmount() {
        return (newIndex - oldIndex) * calculateCoefficient() * 550;
    }

    public int calculateSurcharge() {
        int difference = newIndex - oldIndex;
        int totalAmount = calculateTotalAmount();

        if (difference < 50) {
            return 0;
        } else if (difference <= 100) {
            return Math.round(totalAmount * 0.35f);
        } else {
            return totalAmount;
        }
    }

    public int calculateTotalPayment() {
        return calculateTotalAmount() + calculateSurcharge();
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d", id, calculateCoefficient(),
                calculateTotalAmount(), calculateSurcharge(), calculateTotalPayment());
    }
}
