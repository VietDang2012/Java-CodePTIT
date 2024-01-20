package J05004;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<Student>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Student x = new Student();
            x.setName(sc.nextLine());
            x.setClassId(sc.nextLine());
            x.setDate(sc.nextLine());
            x.setGpa(Double.parseDouble(sc.nextLine()));
            a.add(x);
        }
        for (Student x : a) {
            System.out.println(x);
        }
        sc.close();
    }
}
