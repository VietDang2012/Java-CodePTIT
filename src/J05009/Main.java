package J05009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Student x = new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            studentList.add(x);
        }
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.getDiemXt() != b.getDiemXt()) {
                    return a.getId().compareTo(b.getId());
                } else {
                    return (int) a.getDiemXt() - (int) b.getDiemXt();
                }
            }
        });
        double max = 0;
        for (Student x : studentList) {
            if (x.getDiemXt() > max) {
                max = x.getDiemXt();
            }
        }
        for (Student x : studentList) {
            if (x.getDiemXt() == max) {
                System.out.println(x);
            }
        }
        sc.close();
    }
}
