package J05027;

public class Teacher {
    private String name, subjectId, subject, id;
    private static int cnt = 1;

    public Teacher() {
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.subjectId = "";
        this.id = "GV" + String.format("%02d", cnt++);
        String[] s = subject.split("\\s+");
        for (String x : s) {
            this.subjectId += x.substring(0, 1);
        }
        this.subjectId = this.subjectId.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, name, subjectId);
    }
}
