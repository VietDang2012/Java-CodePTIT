package J05043;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEmployees = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            String name = scanner.nextLine();
            String position = scanner.nextLine();
            double basicSalary = Double.parseDouble(scanner.nextLine());
            double workDays = Double.parseDouble(scanner.nextLine());
            employees.add(new Employee(name, position, basicSalary, workDays));
        }

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return a.getId().compareTo(b.getId());
            }
        });

        for (Employee employee : employees) {
            System.out.printf("%s %s %.0f %.0f %.0f %.0f\n", employee.getId(), employee.getName(),
                    employee.getAllowance(), employee.getMainSalary(), employee.getAdvance(),
                    employee.getRemaining());
        }
        scanner.close();
    }
}
