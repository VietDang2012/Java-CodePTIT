import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));
        List<String> list1 = (ArrayList<String>) in.readObject();
        List<String> list2 = new ArrayList<>();
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        for (String i : list1) {
            set1.addAll(Arrays.asList(i.trim().toLowerCase().split("\\s+")));
        }
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim().toLowerCase();
            list2.addAll(Arrays.asList(s.split("\\s+")));
        }
        for (String i : list2) {
            if (!set2.contains(i) && set1.contains(i)) {
                System.out.println(i);
                set2.add(i);
            }
        }
    }
}
