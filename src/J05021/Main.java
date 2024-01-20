package J05021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<Student>();
        while (sc.hasNextLine()) {
            String maSV = sc.nextLine();
            if (maSV.isEmpty()) {
                break;
            }
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            a.add(new Student(maSV, hoTen, lop, email));
        }
        Collections.sort(a);
        for (Student x : a) {
            System.out.println(x);
        }
        sc.close();
    }
}
