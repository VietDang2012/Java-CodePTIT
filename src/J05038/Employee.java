package J05038;

public class Employee {
    private String id, name, position;
    private int daySal, monthSal, day, reward, allowance;
    private long total;
    private static int cnt = 0;

    public Employee() {
    }

    public Employee(String name, int daySal, int day, String position) {
        this.id = String.format("NV%02d", ++cnt);
        this.name = name;
        this.daySal = daySal;
        this.day = day;
        this.position = position;
        this.monthSal = daySal * day;
        if (position.equals("GD")) {
            this.allowance = 250000;
        } else if (position.equals("PGD")) {
            this.allowance = 200000;
        } else if (position.equals("TP")) {
            this.allowance = 180000;
        } else {
            this.allowance = 150000;
        }
        if (day >= 25) {
            this.reward = this.monthSal * 20 / 100;
        } else if (day >= 22) {
            this.reward = this.monthSal * 10 / 100;
        } else {
            this.reward = 0;
        }
        this.total = this.monthSal + this.reward + this.allowance;
    }

    public long getTotal() {
        return total;
    }

    public String getPosition() {
        return position;
    }

    public int getDay() {
        return day;
    }

    public int getDaySal() {
        return daySal;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", id, name, monthSal, reward, allowance, total);
    }
}
