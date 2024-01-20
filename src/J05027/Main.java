package J05027;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Teacher x = new Teacher(sc.nextLine(), sc.nextLine());
            teacherList.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String tmp = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tmp + ":");
            tmp = tmp.toLowerCase();
            for (Teacher x : teacherList) {
                if (x.getName().toLowerCase().contains(tmp)) {
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
