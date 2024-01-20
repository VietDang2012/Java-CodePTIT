import java.io.*;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws IOException {
        File inp = new File("DATA.in");
        Scanner sc = new Scanner(inp);
        int[] cnt = new int[1001];
        while (sc.hasNextInt()) {
            ++cnt[sc.nextInt()];
        }
        for (int i = 0; i < 1001; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
        sc.close();
    }
}
