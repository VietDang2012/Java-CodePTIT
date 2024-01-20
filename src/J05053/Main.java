package J05053;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Order> orders = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String orderCode = sc.nextLine();
            double unitPrice = Double.parseDouble(sc.nextLine());
            int quantity = Integer.parseInt(sc.nextLine());
            orders.add(new Order(name, orderCode, unitPrice, quantity));
        }
        Collections.sort(orders, Comparator.comparingInt(o -> o.getOrderNumber()));
        for (Order order : orders) {
            System.out.println(order);
        }
        sc.close();
    }
}
