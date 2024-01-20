package J07034;

public class Subject implements Comparable<Subject> {
    private String id, name, credits;

    public Subject() {
    }

    public Subject(String id, String name, String credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, name, credits);
    }

    @Override
    public int compareTo(Subject other) {
        return this.name.compareTo(other.name);
    }
}
