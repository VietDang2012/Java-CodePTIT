import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
        sc.close();
    }

    static String solve(String s) {
        int size = s.length();
        int cnt = 0;
        for (int i = 0; i < size / 2; i++) {
            if (s.charAt(i) != s.charAt(size - i - 1)) {
                cnt++;
            }
        }
        if (size % 2 == 0 && cnt == 1) {
            return "YES";
        } else if (size % 2 != 0 && cnt == 0) {
            return "YES";
        } else if (size % 2 != 0 && cnt == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}