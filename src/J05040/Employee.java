package J05040;

public class Employee {
    private String name, position;
    private int monthSalary, basicSalary, workingDays, bonus, allowance, totalIncome;

    public Employee(String name, int basicSalary, int workingDays, String position) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.workingDays = workingDays;
        this.position = position;

        switch (position) {
            case "GD":
                allowance = 250000;
                break;
            case "PGD":
                allowance = 200000;
                break;
            case "TP":
                allowance = 180000;
                break;
            case "NV":
                allowance = 150000;
                break;
            default:
                allowance = 0;
                break;
        }
        this.monthSalary = basicSalary * workingDays;
        if (workingDays >= 25) {
            bonus = (int) (0.20 * monthSalary);
        } else if (workingDays >= 22) {
            bonus = (int) (0.10 * monthSalary);
        } else {
            bonus = 0;
        }
        // Calculate totalIncome
        totalIncome = monthSalary + bonus + allowance;
    }

    public String getName() {
        return name;
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    public String getPosition() {
        return position;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    @Override
    public String toString() {
        return name + " " + monthSalary + " " + bonus + " " + allowance + " "
                + totalIncome;
    }
}
