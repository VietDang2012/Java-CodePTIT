package J05035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Intern> interns = new ArrayList<Intern>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Intern a = new Intern(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            interns.add(a);
        }
        Collections.sort(interns, new Comparator<Intern>() {
            @Override
            public int compare(Intern x, Intern y) {
                return x.getId().compareTo(y.getId());
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String company = sc.nextLine();
            for (Intern intern : interns) {
                if (intern.getEnterprise().equals(company)) {
                    System.out.println(intern);
                }
            }
        }
        sc.close();
    }
}
