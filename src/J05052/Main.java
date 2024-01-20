package J05052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Order[] orders = new Order[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String orderCode = scanner.nextLine();
            double unitPrice = scanner.nextDouble();
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng newline

            orders[i] = new Order(name, orderCode, unitPrice, quantity);
        }
        for (Order order : orders) {
            System.out.println(order);
        }
        scanner.close();
    }
}
