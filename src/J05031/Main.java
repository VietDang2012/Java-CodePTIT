package J05031;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            students.add(a);
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student x, Student y) {
                return x.getName().compareTo(y.getName());
            }
        });
        int cnt = 0;
        for (Student x : students) {
            System.out.printf("%d ", ++cnt);
            System.out.println(x);
        }
        sc.close();
    }
}
