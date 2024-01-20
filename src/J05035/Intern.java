package J05035;

public class Intern {
    private String id, name, classId, email, enterprise, number;
    private static int cnt = 1;

    public Intern() {
    }

    public Intern(String id, String name, String classId, String email, String enterprise) {
        this.number = String.format("%d", cnt++);
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.email = email;
        this.enterprise = enterprise;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEnterprise() {
        return enterprise;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", number, id, name, classId, email, enterprise);
    }
}