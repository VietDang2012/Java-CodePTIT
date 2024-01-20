package J07033;

public class Student implements Comparable<Student> {
    private String id, name, classId, email;

    public Student() {
    }

    public Student(String id, String name, String classId, String email) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.email = email;
        StringBuilder newName = new StringBuilder();
        String[] nameParts = name.trim().toLowerCase().split("\\s+");
        for (String namePart : nameParts) {
            newName = newName.append(namePart.substring(0, 1).toUpperCase()).append(namePart.substring(1)).append(" ");
        }
        this.name = newName.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s%s %s", id, name, classId, email);
    }

    @Override
    public int compareTo(Student other) {
        return this.id.toLowerCase().compareTo(other.id.toLowerCase());
    }
}
