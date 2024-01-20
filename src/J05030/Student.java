package J05030;

public class Student {
    private String id, name, classId;
    private double diem1, diem2, diem3;

    public Student() {
    }

    public Student(String id, String name, String classId, double diem1, double diem2, double diem3) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %.1f %.1f", id, name, classId, diem1, diem2, diem3);
    }
}