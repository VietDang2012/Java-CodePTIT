package J04005;

public class Examinee {
    private String name, dateOfBirth;
    private double p1, p2, p3;

    public Examinee(String name, String dateOfBirth, double p1, double p2, double p3) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP1() {
        return p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP2() {
        return p2;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getP3() {
        return p3;
    }

    public double getTotal() {
        return this.p1 + this.p2 + this.p3;
    }
}
