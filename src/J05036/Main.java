package J05036;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Product x = new Product(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()));
            productList.add(x);
        }
        for (Product product : productList) {
            System.out.println(product);
        }
        sc.close();
    }
}
