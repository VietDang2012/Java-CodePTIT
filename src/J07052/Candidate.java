package J07052;

import java.text.DecimalFormat;

public class Candidate implements Comparable<Candidate> {
    private String id, name;
    private double p1, p2, p3, ovp, bp;
    private String status;

    public Candidate(String id, String name, double p1, double p2, double p3) {
        this.id = id;
        name = name.trim().toLowerCase();
        String[] s = name.split("\\s+");
        this.name = "";
        for (String i : s)
            this.name += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        this.name = this.name.trim();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        if (id.charAt(2) == '1')
            bp = 0.5;
        else if (id.charAt(2) == '2')
            bp = 1;
        else
            bp = 2.5;
        ovp = p1 * 2 + p2 + p3 + bp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getOvp() {
        return ovp;
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

    @Override
    public String toString() {
        return id + " " + name + " " + (new DecimalFormat().format(bp)) + " "
                + (new DecimalFormat().format(ovp)) + " " + status;
    }

    @Override
    public int compareTo(Candidate o) {
        if (ovp > o.ovp)
            return -1;
        else if (ovp < o.ovp)
            return 1;
        return id.compareTo(o.id);
    }
}
