package J07056;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Family> families = new ArrayList<>();
        while (sc.hasNextLine()) {
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0) {
                String name = sc.nextLine();
                String[] info = sc.nextLine().trim().split("\\s+");
                Family x = new Family(name, info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]));
                families.add(x);
            }
            Collections.sort(families, new Comparator<Family>() {
                @Override
                public int compare(Family f1, Family f2) {
                    return f2.payPrice() - f1.payPrice();
                }
            });
            for (Family family : families) {
                System.out.println(family);
            }
        }
        sc.close();
    }
}
