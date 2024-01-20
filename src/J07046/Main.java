package J07046;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        List<Customer> customers = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        while (n-- > 0) {
            Customer x = new Customer(sc.nextLine(), sc.nextLine(), dfm.parse(sc.nextLine()), dfm.parse(sc.nextLine()));
            customers.add(x);
        }
        Collections.sort(customers);
        for (Customer i : customers) {
            System.out.println(i);
        }
        sc.close();
    }
}
