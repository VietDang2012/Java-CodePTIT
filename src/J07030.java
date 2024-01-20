import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class J07030 {
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int max = 1000000;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        Set<Integer> set1 = new TreeSet<>((ArrayList<Integer>) in.readObject());
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> set2 = new TreeSet<>((ArrayList<Integer>) in.readObject());
        for (Integer i : set1) {
            if (i < max - i && isPrime(i) && isPrime(max - i) && set2.contains(max - i)) {
                System.out.println(i + " " + (max - i));
            }
        }
        in.close();
    }
}
