package J07072;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DANHSACH.in"));
        List<Name> list = new ArrayList<>();
        while (in.hasNextLine()) {
            Name x = new Name(in.nextLine().toLowerCase());
            list.add(x);
        }
        Collections.sort(list);
        for (Name x : list) {
            System.out.println(x.getFullName());
        }
        in.close();
    }
}
