package J07055;

public class Student implements Comparable<Student> {
    private String id, name, classification;
    private double p1, p2, p3, op;
    private static int cnt = 0;

    public Student() {
    }

    public Student(String name, double p1, double p2, double p3) {
        this.name = normalizeName(name);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.id = String.format("SV%02d", ++cnt);
        this.op = (p1 * 0.25) + (p2 * 0.35) + (p3 * 0.4);
        if (this.op >= 8.0) {
            classification = "GIOI";
        } else if (this.op >= 6.5) {
            classification = "KHA";
        } else if (this.op >= 5.0) {
            classification = "TRUNG BINH";
        } else {
            classification = "KEM";
        }
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getP3() {
        return p3;
    }

    public static String normalizeName(String inputName) {
        if (inputName == null) {
            return "";
        }
        String normalizedName = inputName.trim().toLowerCase();
        String[] words = normalizedName.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(word.substring(0, 1).toUpperCase());
                sb.append(word.substring(1));
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", id, name, op, classification);
    }

    @Override
    public int compareTo(Student other) {
        return (int) (Math.round(other.op) - Math.round(this.op));
    }
}
