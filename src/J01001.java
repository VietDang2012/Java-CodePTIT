import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a, b;
        a = sc.nextByte();
        b = sc.nextByte();
        if (a > 0 && b > 0) {
            System.out.print((a + b) * 2);
            System.out.print(" ");
            System.out.println(a * b);
        } else {
            System.out.println('0');
        }
        sc.close();
    }
}
