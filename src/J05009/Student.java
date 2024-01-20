package J05009;

public class Student {
    private String name, date, id;
    private double diem1, diem2, diem3, diemXt;
    private static int cnt = 1;

    public Student() {
    }

    public Student(String name, String date, double diem1, double diem2, double diem3) {
        this.name = name;
        this.id = String.format("%d", cnt++);
        this.date = date;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        diemXt = diem1 + diem2 + diem3;
    }

    public double getDiemXt() {
        diemXt = diem1 + diem2 + diem3;
        return diemXt;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f", id, name, date, diemXt);
    }
}
