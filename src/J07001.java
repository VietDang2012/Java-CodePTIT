import java.io.*;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Data.in"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
