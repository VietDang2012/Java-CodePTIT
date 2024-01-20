package J05018;

public class Student implements Comparable<Student> {
    private String id, name, classification;;
    private double[] grades;
    private double GPA;
    private static int cnt = 0;

    public Student() {
    }

    public Student(String name, double[] grades) {
        this.id = String.format("HS%02d", ++cnt);
        this.name = name;
        this.grades = grades;
        this.GPA = calculateGPA();
        this.classification = calculateClassification();
    }

    private double calculateGPA() {
        double sum = 0;
        double totalCoefficient = 0;
        double coefficient;
        for (int i = 0; i < grades.length; i++) {
            coefficient = i < 2 ? 2 : 1;
            sum += grades[i] * coefficient;
            totalCoefficient += coefficient;
        }
        return sum /= totalCoefficient;
    }

    private String calculateClassification() {
        if (GPA >= 9.0) {
            return "XUAT SAC";
        } else if (GPA >= 8.0) {
            return "GIOI";
        } else if (GPA >= 7.0) {
            return "KHA";
        } else if (GPA >= 5.0) {
            return "TB";
        } else {
            return "YEU";
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.01f %s", id, name, Math.round(GPA * 10.0) / 10.0, classification);
    }

    @Override
    public int compareTo(Student other) {
        if (this.GPA == other.GPA) {
            return this.id.compareTo(other.id);
        } else {
            return Double.compare(other.GPA, this.GPA);
        }
    }
}
