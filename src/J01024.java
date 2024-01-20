import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int t = 0; t < T; t++) {
            String s = sc.next();
            if (isValidNumber(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean isValidNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            char number = s.charAt(i);
            if (number != '0' && number != '1' && number != '2') {
                return false;
            }
        }
        return true;
    }
}
