package J05041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < numEmployees; i++) {
            String name = scanner.nextLine();
            int basicSalary = scanner.nextInt();
            int daysWorked = scanner.nextInt();
            scanner.nextLine();
            String position = scanner.nextLine();

            Employee employee = new Employee(name, basicSalary, daysWorked, position);
            employees.add(employee);
        }

        for (Employee employee : employees) {
            int allowance = 0;
            switch (employee.getPosition()) {
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
            }
            employee.setAllowance(allowance);
        }

        Collections.sort(employees, (e1, e2) -> e2.calculateSalary() - e1.calculateSalary());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scanner.close();
    }
}
