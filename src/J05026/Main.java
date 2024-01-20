package J05026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Lecturer> lecturers = new ArrayList<>();
        while (n-- > 0) {
            Lecturer x = new Lecturer(sc.nextLine(), sc.nextLine());
            lecturers.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String key = sc.nextLine();
            String[] letters = key.trim().toUpperCase().split("\\s+");
            key = "";
            for (String letter : letters) {
                key += letter.substring(0, 1);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + key + ":");
            for (Lecturer x : lecturers) {
                if (x.getSubjectId().equals(key)) {
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
