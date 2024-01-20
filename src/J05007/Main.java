package J05007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Staff> a = new ArrayList<Staff>();
        while (n-- > 0) {
            Staff x = new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine());
            x.setId();
            a.add(x);
        }
        Collections.sort(a);
        for (Staff x : a) {
            System.out.println(x);
        }
        sc.close();
    }
}
