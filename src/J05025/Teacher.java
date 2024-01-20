package J05025;

public class Teacher {
    private String name, id, subject, subjectId;
    private static int cnt = 1;

    public Teacher() {
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.id = String.format("GV%02d", cnt++);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        String[] nameParts = name.split("\\s+");
        return nameParts[nameParts.length - 1];
    }

    public String getId() {
        return id;
    }

    public String getSubjectId() {
        String[] nameParts = subject.toUpperCase().split("\\s+");
        subjectId = "";
        for (String namePart : nameParts) {
            subjectId += namePart.substring(0, 1);
        }
        return subjectId;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getSubjectId();
    }
}
