package J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Enterprise> list = new ArrayList<Enterprise>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Enterprise x = new Enterprise(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            list.add(x);
        }
        Collections.sort(list, new Comparator<Enterprise>() {
            @Override
            public int compare(Enterprise a, Enterprise b) {
                if (a.getAmount() == b.getAmount()) {
                    return a.getId().compareTo(b.getId());
                }
                return b.getAmount() - a.getAmount();
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (Enterprise x : list) {
                if (x.getAmount() >= a && x.getAmount() <= b) {
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
