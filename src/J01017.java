import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String s = sc.next();
            if (checkNumbers(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    public static boolean checkNumbers(String s) {
        char[] digits = s.toCharArray();
        for (int i = 1; i < digits.length; i++) {
            if (Math.abs(digits[i] - digits[i - 1]) != 1) {
                return false;
            }
        }
        return true;
    }
}
