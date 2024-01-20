import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class J07032 {
    private static boolean check(int n) {
        String s = Integer.toString(n);
        if (s.length() == 1 || s.length() % 2 == 0)
            return false;
        for (int i = 0; i <= s.length() / 2; ++i) {
            if (s.charAt(i) % 2 == 0)
                return false;
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        Set<Integer> set1 = new TreeSet<>(list1);
        Set<Integer> set2 = new TreeSet<>(list2);
        for (int i : set1) {
            if (set2.contains(i) && check(i)) {
                numList.add(i);
            }
            if (numList.size() == 10) {
                break;
            }
        }
        for (int i : numList) {
            System.out.println(i + " " + (Collections.frequency(list1, i) + Collections.frequency(list2, i)));
        }
    }
}
