package J07055;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        List<Student> students = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            Student x = new Student(in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine()));
            students.add(x);
        }
        Collections.sort(students);
        for (Student x : students) {
            System.out.println(x);
        }
        in.close();
    }
}