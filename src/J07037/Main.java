package J07037;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DN.in"));
        List<Enterprise> enterprises = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            Enterprise x = new Enterprise(in.nextLine(), in.nextLine(), in.nextLine());
            enterprises.add(x);
        }
        Collections.sort(enterprises);
        for (Enterprise x : enterprises) {
            System.out.println(x);
        }
        in.close();
    }
}
