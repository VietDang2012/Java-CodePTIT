package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String id, name;
    private int price;
    private double fee;

    public LoaiPhong() {
    }

    public LoaiPhong(String s) {
        String[] a = s.trim().split("\\s+");
        this.id = a[0];
        this.name = a[1];
        this.price = Integer.parseInt(a[2]);
        this.fee = Double.parseDouble(a[3]);
    }

    public double getFee() {
        return fee;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.2f", id, name, price, fee);
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.name.compareTo(other.name);
    }
}
