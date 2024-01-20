package J06003;

public class Student {
    private String id, name, phoneNumber, group;

    public Student() {
    }

    public Student(String id, String name, String phoneNumber, String group) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, name, phoneNumber);
    }
}
