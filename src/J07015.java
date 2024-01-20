import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        int sqr = (int) Math.sqrt(n);
        for (int i = 5; i <= sqr; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        in.close();
        int[] cnt = new int[10005];
        for (int i : list) {
            if (isPrime(i))
                ++cnt[i];
        }
        for (int i = 2; i <= 10000; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
