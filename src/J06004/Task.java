package J06004;

public class Task {
    private String id, name;
    private static int cnt = 0;

    public Task() {
    }

    public Task(String name) {
        this.id = String.format("%s", ++cnt);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
