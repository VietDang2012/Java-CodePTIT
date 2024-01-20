package J05051;

public class Customer {
    private String id, type;
    private int oldIndex, newIndex;
    private double coefficient, totalPrice;

    public Customer(String id, String type, int oldIndex, int newIndex) {
        this.id = id;
        this.type = type;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        calculateCoefficient();
        calculateTotalPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private void calculateCoefficient() {
        switch (type) {
            case "KD":
                coefficient = 3;
                break;
            case "NN":
                coefficient = 5;
                break;
            case "TT":
                coefficient = 4;
                break;
            case "CN":
                coefficient = 2;
                break;
            default:
                coefficient = 1;
        }
    }

    private void calculateTotalPrice() {
        double rawPrice = (newIndex - oldIndex) * coefficient * 550;
        double surcharge = 0;

        if (newIndex - oldIndex >= 50 && newIndex - oldIndex <= 100) {
            surcharge = rawPrice * 0.35;
        } else if (newIndex - oldIndex > 100) {
            surcharge = rawPrice;
        }

        totalPrice = Math.round((rawPrice + surcharge));
    }

    @Override
    public String toString() {
        return String.format("%s %d %.0f %.0f %.0f", id, (int) coefficient, (newIndex - oldIndex) * coefficient * 550,
                (newIndex - oldIndex >= 50) ? (totalPrice - (newIndex - oldIndex) * coefficient * 550) : 0, totalPrice);
    }
}
