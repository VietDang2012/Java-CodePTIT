package J05011;

public class Gamer implements Comparable<Gamer> {
    private String id, name;
    private long timePlayed;

    public Gamer() {
    }

    public Gamer(String id, String name, long timePlayed) {
        this.id = id;
        this.name = name;
        this.timePlayed = timePlayed;
    }

    @Override
    public int compareTo(Gamer o) {
        return Long.compare(o.timePlayed, this.timePlayed);
    }

    @Override
    public String toString() {
        long hours = timePlayed / (60 * 60 * 1000);
        long remainingMillis = timePlayed % (60 * 60 * 1000);
        long minutes = remainingMillis / (60 * 1000);
        return String.format("%s %s %d gio %d phut", id, name, hours, minutes);
    }

}
