package J05050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCustomers = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfCustomers; i++) {
            String customerType = scanner.nextLine();
            int oldIndex = Integer.parseInt(scanner.nextLine());
            int newIndex = Integer.parseInt(scanner.nextLine());
            Customer customer = new Customer(customerType, oldIndex, newIndex);
            System.out.println(customer);
        }
        scanner.close();
    }
}
