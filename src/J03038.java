import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[1001];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (cnt[s.charAt(i)] == 0) {
                sum++;
                cnt[s.charAt(i)] = 1;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}