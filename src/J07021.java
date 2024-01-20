import java.util.*;
import java.io.*;

public class J07021 {
    public static void main(String[] args) throws IOException {
        File inp = new File("DATA.in");
        Scanner sc = new Scanner(inp);
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            if (s.equals("END")) {
                sc.close();
                return;
            }
            String[] arr = s.toUpperCase().split("\\s+");
            StringBuilder formattedName = new StringBuilder();
            for (String a : arr) {
                formattedName.append(a.charAt(0) + a.substring(1, a.length()).toLowerCase()).append(" ");
            }
            System.out.println(formattedName);
        }
        sc.close();
    }
}
