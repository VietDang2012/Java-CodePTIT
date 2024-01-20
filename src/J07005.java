import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] cnt = new int[1001];
        for (int i = 0; i < 100000; i++) {
            int n = in.readInt();
            ++cnt[n];
        }
        for (int i = 0; i < 1001; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
        in.close();
    }
}
