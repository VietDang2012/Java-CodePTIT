package J07050;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("MATHANG.in"));
        List<Product> products = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            Product x = new Product(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine()));
            products.add(x);
        }
        Collections.sort(products);
        for (Product x : products) {
            System.out.println(x);
        }
        in.close();
    }
}
