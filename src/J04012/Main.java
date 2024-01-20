package J04012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wage A = new Wage(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),
                sc.nextLine());
        System.out.println(A);
        sc.close();
    }
}