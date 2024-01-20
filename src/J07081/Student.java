package J07081;

public class Student implements Comparable<Student> {
    private String id, fullName, firstName, lastName, midName, contact, email;

    public Student() {
    }

    public Student(String id, String fullName, String contact, String email) {
        this.id = id;
        this.fullName = fullName;
        this.contact = contact;
        this.email = email;
        String[] a = fullName.trim().split("\\s+");
        this.midName = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                this.lastName = a[i];
            } else if (i == a.length - 1) {
                this.firstName = a[i];
            } else {
                this.midName += a[i];
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, fullName, contact, email);
    }

    @Override
    public int compareTo(Student other) {
        if (this.firstName.equals(other.firstName)) {
            if (this.lastName.equals(other.lastName)) {
                if (this.midName.equals(other.midName)) {
                    return this.id.compareTo(other.id);
                }
                return this.midName.compareTo(other.midName);
            }
            return this.lastName.compareTo(other.lastName);
        }
        return this.firstName.compareTo(other.firstName);
    }
}
