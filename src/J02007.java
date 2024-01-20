import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); // Đọc số lượng bộ test

        for (int t = 1; t <= testCases; t++) {
            int n = sc.nextInt();
            int[] arr = new int[n], cnt = new int[100005];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                cnt[arr[i]]++;
            }
            System.out.println("Test " + t + ":");
            for (int i = 0; i < n; i++) {
                if (cnt[arr[i]] > 0) {
                    System.out.println(arr[i] + " xuat hien " + cnt[arr[i]] + " lan");
                    cnt[arr[i]] = 0;
                }
            }
        }
        sc.close();
    }
}
