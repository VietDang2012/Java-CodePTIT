package J05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<Student>();
        while (n-- > 0) {
            Student st1 = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(st1);
        }
        Collections.sort(a);
        for (Student x : a) {
            System.out.println(x);
        }
        sc.close();
    }
}
