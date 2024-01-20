package J07033;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> students = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            Student x = new Student(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            students.add(x);
        }
        Collections.sort(students);
        for (Student i : students) {
            System.out.println(i);
        }
        in.close();
    }
}