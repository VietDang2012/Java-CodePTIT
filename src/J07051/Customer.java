package J07051;

import java.util.Date;

public class Customer {
    private String id, name, roomId;
    private int expenses;
    private Date inDate, outDate;
    private static int cnt = 0;

    public Customer() {
    }

    public Customer(String name, String roomId, Date inDate, Date outDate, int expenses) {
        this.id = String.format("KH%02d", ++cnt);
        this.name = formattedName(name);
        this.roomId = roomId;
        this.inDate = inDate;
        this.outDate = outDate;
        this.expenses = expenses;
    }

    public int getExpenses() {
        return expenses;
    }

    public String formattedName(String name) {
        StringBuilder formattedName = new StringBuilder();
        String[] words = name.trim().split("\\s+");

        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String othersLetter = word.substring(1).toLowerCase();
            formattedName.append(firstLetter).append(othersLetter).append(" ");
        }
        return formattedName.toString().trim();
    }

    public long payPrice() {
        return ((daysStayed() * unitPrice()) + getExpenses()) * 1l;
    }

    public long daysStayed() {
        return (outDate.getTime() - inDate.getTime()) / (1000l * 60 * 60 * 24) + 1;
    }

    public int unitPrice() {
        String floor = roomId.substring(0, 1);
        if (floor.equals("1")) {
            return 25;
        } else if (floor.equals("2")) {
            return 34;
        } else if (floor.equals("3")) {
            return 50;
        } else {
            return 80;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", id, name, roomId, daysStayed(), payPrice());
    }
}
