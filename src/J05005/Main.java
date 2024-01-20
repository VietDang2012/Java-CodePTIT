package J05005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<Student>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            Student x = new Student();
            x.setName(sc.nextLine());
            x.setClassId(sc.nextLine());
            x.setDate(sc.nextLine());
            x.setGpa(sc.nextDouble());
            x.setId();
            sc.nextLine();
            a.add(x);
        }
        Collections.sort(a, (x, y) -> {
            if (x.getGpa() < y.getGpa()) {
                return 1;
            } else {
                return -1;
            }
        });
        for (Student x : a) {
            System.out.println(x);
        }
        sc.close();
    }
}
