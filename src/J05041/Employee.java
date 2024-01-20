package J05041;

public class Employee {
    private static int nextId = 1;
    private int id, basicSalary, daysWorked, allowance, salary;
    private String name, position;
    private double bonus;

    public Employee(String name, int basicSalary, int daysWorked, String position) {
        this.id = nextId++;
        this.name = name;
        this.basicSalary = basicSalary;
        this.daysWorked = daysWorked;
        this.position = position;
        this.allowance = 0;
        this.bonus = 0;
        this.salary = basicSalary * daysWorked;
        if (daysWorked >= 25) {
            this.bonus = 0.2 * salary;
        } else if (daysWorked >= 22) {
            this.bonus = 0.1 * salary;
        } else {
            this.bonus = 0;
        }
    }

    public String getPosition() {
        return position;
    }

    public int calculateSalary() {
        int salary = basicSalary * daysWorked;
        return salary + (int) bonus + allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "NV" + String.format("%02d", id) + " " + name + " " + (basicSalary * daysWorked) + " " +
                (int) bonus + " " + allowance + " " + calculateSalary();
    }
}
