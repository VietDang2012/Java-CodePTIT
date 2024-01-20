import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class J07031 {
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
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        Set<Integer> set1 = new TreeSet<>(a);
        Set<Integer> set2 = new TreeSet<>(b);
        for (int i : set1)
            if (i < 1000000 - i && !set2.contains(i) && !set2.contains(1000000 - i) && isPrime(i)
                    && set1.contains(1000000 - i) && isPrime(1000000 - i))
                System.out.println(i + " " + (1000000 - i));
    }
}
