import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int numTests = sc.nextInt();
        for (int i = 0; i < numTests; i++) {
            String s = sc.next();
            if (checkNumbers(s) && numbersSum(s)) {
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
            if (Math.abs(digits[i] - digits[i - 1]) != 2 || Math.abs(digits[i] - digits[i - 1]) > 2
                    || Math.abs(digits[i] - digits[i - 1]) < 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean numbersSum(String s) {
        char[] digits = s.toCharArray();
        long sum = 0;
        for (int i = 0; i < digits.length; i++) {
            int num = Integer.parseInt(String.valueOf(digits[i]));
            sum += num;
        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }
}
