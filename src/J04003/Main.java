package J04003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(), y = sc.nextLong();
        Fraction A = new Fraction(x, y);
        A.reduceFraction();
        System.out.println(A.getNumerator() + "/" + A.getDenominator());
        sc.close();
    }
}
