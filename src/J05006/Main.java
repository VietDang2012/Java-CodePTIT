package J05006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            String fullName = scanner.nextLine();
            String gender = scanner.nextLine();
            String dateOfBirth = scanner.nextLine();
            String address = scanner.nextLine();
            String taxId = scanner.nextLine();
            String contractDate = scanner.nextLine();
            employees[i] = new Employee(fullName, gender, dateOfBirth, address, taxId, contractDate);
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scanner.close();
    }
}
