package J05051;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Customer[] customers = new Customer[n];
        for (int i = 0; i < n; i++) {
            String id = "KH" + String.format("%02d", i + 1);
            String type = scanner.nextLine();
            int oldIndex = scanner.nextInt();
            int newIndex = scanner.nextInt();
            scanner.nextLine();
            customers[i] = new Customer(id, type, oldIndex, newIndex);
        }
        Arrays.sort(customers, Comparator.comparingDouble(c -> -c.getTotalPrice()));
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        scanner.close();
    }
}
