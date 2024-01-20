package J05037;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = Integer.parseInt(scanner.nextLine());
        Product[] items = new Product[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            String name = scanner.nextLine();
            String unit = scanner.nextLine();
            double costPrice = Double.parseDouble(scanner.nextLine());
            int quantity = Integer.parseInt(scanner.nextLine());
            items[i] = new Product(name, unit, costPrice, quantity);
        }
        Arrays.sort(items);
        for (int i = 0; i < numberOfItems; i++) {
            Product item = items[i];
            System.out.printf("%s %s %s %.0f %.0f %.0f%n",
                    item.getId(), item.getName(), item.getUnit(),
                    item.getShippingFee(), item.getTotalCost(), item.getRetailPrice());
        }
        scanner.close();
    }
}
