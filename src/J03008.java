import java.util.Scanner;

public class J03008 {
    public static void main(String[] args) {
        boolean check[] = new boolean[1001];
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 2; i < 1001; i++) {
            check[i] = true;
        }
        for (int i = 2; i < 10; i++) {
            if (check[i] == true) {
                for (int j = 2 * i; j < 1001; j += i) {
                    check[j] = false;
                }
            }
        }
        for (int i = 0; i < testCases; i++) {
            String s = sc.next();
            String newString = "";
            boolean isTrueNumber = true;
            for (int j = s.length() - 1; j >= 0; j--) {
                int x = (s.charAt(j) - '0');
                if (check[x] == true) {
                    String tmp = s.charAt(j) + "";
                    newString += tmp;
                } else {
                    isTrueNumber = false;
                    break;
                }
            }
            if (isTrueNumber == false) {
                System.out.println("NO");
            } else {
                if (s.equals(newString)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
        sc.close();
    }
}