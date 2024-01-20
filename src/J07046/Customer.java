package J07046;

import java.util.Date;

public class Customer implements Comparable<Customer> {
    private String id, name, roomId;
    private Date startDate, endDate;
    private long daysStayed;
    private static int cnt = 0;

    public Customer() {
    }

    public Customer(String name, String roomId, Date startDate, Date endDate) {
        this.id = String.format("KH%02d", ++cnt);
        this.name = name;
        this.roomId = roomId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.daysStayed = (this.endDate.getTime() - this.startDate.getTime()) / (1000l * 60 * 60 * 24);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + roomId + " " + daysStayed;
    }

    @Override
    public int compareTo(Customer o) {
        return (int) (o.daysStayed - this.daysStayed);
    }
}