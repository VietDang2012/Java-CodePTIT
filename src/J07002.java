import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        String s;
        while (sc.hasNext()) {
            s = sc.next();
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
