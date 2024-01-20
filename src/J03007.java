import java.util.Scanner;

public class J03007 {
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
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int x = (s.charAt(i) - '0');
            String tmp = s.charAt(i) + "";
            newString += tmp;
            res += x;
        }
        if (s.equals(newString) && s.charAt(s.length() - 1) == '8' && s.charAt(0) == '8' && res % 10 == 0) {
            return 1;
        }
        return 0;
    }
}