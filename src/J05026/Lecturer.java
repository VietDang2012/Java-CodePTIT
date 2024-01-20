package J05026;

public class Lecturer {
    private String id, name, subject, subjectId;
    private static int cnt = 0;

    public Lecturer() {
    }

    public Lecturer(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.id = String.format("GV%02d", ++cnt);
        String[] letters = subject.trim().toUpperCase().split("\\s+");
        this.subjectId = "";
        for (String letter : letters) {
            subjectId += letter.substring(0, 1);
        }
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, name, getSubjectId());
    }

}
