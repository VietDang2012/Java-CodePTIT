package J04009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            Triangle A = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble(), sc.nextDouble());
            System.out.println(A);
        }
        sc.close();
    }
}