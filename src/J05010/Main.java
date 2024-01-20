package J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> a = new ArrayList<Product>();
        while (n-- > 0) {
            a.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(a, (x, y) -> {
            return (int) y.getProfit() - (int) x.getProfit();
        });
        for (Product x : a) {
            System.out.println(x);
        }
        sc.close();
    }
}
