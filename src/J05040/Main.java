package J05040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int basicSalary = sc.nextInt();
            int workingDays = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String position = sc.nextLine();
            employees[i] = new Employee(name, basicSalary, workingDays, position);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("NV" + String.format("%02d", i + 1) + " " + employees[i]);
        }

        sc.close();
    }
}
