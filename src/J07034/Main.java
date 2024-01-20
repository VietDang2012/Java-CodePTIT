package J07034;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        List<Subject> subjects = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            Subject x = new Subject(in.nextLine(), in.nextLine(), in.nextLine());
            subjects.add(x);
        }
        Collections.sort(subjects);
        for (Subject x : subjects) {
            System.out.println(x);
        }
        in.close();
    }
}
