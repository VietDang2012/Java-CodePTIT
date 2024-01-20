package J04004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction A = new Fraction(sc.nextLong(), sc.nextLong()), B = new Fraction(sc.nextLong(), sc.nextLong());
        A.fractionSum(B);
        System.out.println(A.getNumerator() + "/" + A.getDenominator());
        sc.close();
    }
}
