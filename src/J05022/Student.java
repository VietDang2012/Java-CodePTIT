package J05022;

public class Student {
    private String id, name, email, classId;

    public Student() {
    }

    public Student(String id, String name, String classId, String email) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.email = email;
    }

    public String getClassId() {
        return classId;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, name, classId, email);
    }

}
