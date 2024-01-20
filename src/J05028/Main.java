package J05028;

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
        for (Enterprise x : list) {
            System.out.println(x);
        }
        sc.close();
    }
}
