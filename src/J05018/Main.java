package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            double[] grades = new double[10];
            for (int i = 0; i < grades.length; i++) {
                grades[i] = sc.nextDouble();
            }
            Student x = new Student(name, grades);
            sc.nextLine();
            students.add(x);
        }
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
        sc.close();
    }
}
