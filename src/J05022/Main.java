package J05022;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Student x = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            studentList.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for (Student x : studentList) {
                if (x.getClassId().equals(s)) {
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
