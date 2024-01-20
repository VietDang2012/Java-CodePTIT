package J05032;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Person[] nguoi = new Person[t];
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            nguoi[i] = new Person(s);
        }
        Arrays.sort(nguoi);
        System.out.println(nguoi[nguoi.length - 1]);
        System.out.println(nguoi[0]);
        sc.close();
    }
}
