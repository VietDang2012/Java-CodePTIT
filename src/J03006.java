import java.util.Scanner;

public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            String s = sc.next();
            int result = check(s);
            if (result == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    static int check(String s) {
        String newString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            int x = (s.charAt(i) - '0');
            if (x % 2 == 0) {
                String tmp = s.charAt(i) + "";
                newString += tmp;
            } else {
                return 0;
            }
        }
        if (s.equals(newString)) {
            return 1;
        }
        return 0;
    }
}