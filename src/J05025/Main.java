package J05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            Teacher x = new Teacher(sc.nextLine(), sc.nextLine());
            teachers.add(x);
        }
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher a, Teacher b) {
                if (a.getName().equals(b.getName())) {
                    return a.getSubjectId().compareTo(b.getSubjectId());
                } else {
                    return a.getFirstName().compareTo(b.getFirstName());
                }
            }
        });
        for (Teacher t : teachers) {
            System.out.println(t);
        }
        sc.close();
    }
}
