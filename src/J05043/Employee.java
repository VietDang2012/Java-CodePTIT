package J05043;

public class Employee {
    private String id, name, position;
    private double basicSalary, workDays;
    private static int count = 0;

    public Employee(String name, String position, double basicSalary, double workDays) {
        this.id = String.format("NV%02d", ++count);
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.workDays = workDays;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAllowance() {
        switch (position) {
            case "GD":
                return 500;
            case "PGD":
                return 400;
            case "TP":
                return 300;
            case "KT":
                return 250;
            default:
                return 100;
        }
    }

    public double getMainSalary() {
        return basicSalary * workDays;
    }

    public double getAdvance() {
        double totalIncome = getMainSalary() + getAllowance();
        double advance = (totalIncome * 2 / 3);

        if (advance < 25000) {
            return Math.round(advance / 1000.0) * 1000.0;
        } else {
            return 25000;
        }
    }

    public double getRemaining() {
        return totalIncome() - getAdvance();
    }

    public double totalIncome() {
        return getMainSalary() + getAllowance();
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f", id, name, getAllowance(), getMainSalary(), getAdvance(),
                getRemaining());
    }
}