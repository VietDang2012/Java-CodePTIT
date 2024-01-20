package J04018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            ComplexNumber a = new ComplexNumber(sc.nextInt(), sc.nextInt()),
                    b = new ComplexNumber(sc.nextInt(), sc.nextInt());
            System.out.println((a.add(b)).multiply(a) + ", " + (a.add(b)).square());
        }
        sc.close();
    }
}
