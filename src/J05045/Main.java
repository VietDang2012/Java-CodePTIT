package J05045;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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
                if (a.totalIncome() == b.totalIncome()) {
                    return a.getId().compareTo(b.getId());
                } else {
                    return (int) (b.totalIncome() - a.totalIncome());
                }
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scanner.close();
    }
}
