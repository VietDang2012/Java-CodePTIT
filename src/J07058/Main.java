package J07058;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        while (sc.hasNextLine()) {
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<Subject> arrList = new ArrayList<Subject>();
            while (t-- > 0) {
                arrList.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            Collections.sort(arrList);
            for (Subject x : arrList) {
                System.out.println(x);
            }
        }
        sc.close();
    }
}
