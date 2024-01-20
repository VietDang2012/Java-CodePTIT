import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws IOException {
        File inp = new File("DATA.in");
        Scanner sc = new Scanner(inp);
        while (sc.hasNextLine()) {
            String numStr = sc.nextLine();
            while (numStr.length() > 1) {
                BigInteger res = new BigInteger("0");
                BigInteger firstHalf = new BigInteger(numStr.substring(0, (numStr.length() / 2)));
                BigInteger secondHalf = new BigInteger(
                        numStr.substring((numStr.length() / 2), numStr.length()));
                res = firstHalf.add(secondHalf);
                numStr = res.toString();
                System.out.println(numStr);
            }
        }
        sc.close();
    }
}
