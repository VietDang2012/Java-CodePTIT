package J05023;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> arrayList = new ArrayList<>();

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        int Q = scanner.nextInt();
        while (Q-- > 0) {
            int year = scanner.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
            for (int i = 0; i < arrayList.size(); i++) {
                if (year == Integer.parseInt("20" + arrayList.get(i).getClassName().substring(1, 3))) {
                    System.out.println(arrayList.get(i));
                }
            }
        }
        scanner.close();
    }
}