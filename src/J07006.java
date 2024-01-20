import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) throws IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            list = (ArrayList<Integer>) (in.readObject());
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        int[] cnt = new int[1001];
        for (Integer i : list) {
            cnt[i]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
        in.close();
    }
}
