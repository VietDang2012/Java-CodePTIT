import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<>();
        while (in.hasNext()) {
            String s = in.next();
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                list.add(s);
            }
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.print(s + " ");
        }
        in.close();
    }
}
