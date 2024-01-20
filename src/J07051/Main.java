package J07051;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Customer> customers = new ArrayList<>();
        while (sc.hasNextLine()) {
            int t = Integer.parseInt(sc.nextLine());
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            while (t-- > 0) {
                String name = sc.nextLine();
                String roomId = sc.nextLine();
                String inDate = sc.nextLine();
                String outDate = sc.nextLine();
                int expenses = Integer.parseInt(sc.nextLine());
                Customer x = new Customer(name, roomId, sdf.parse(inDate), sdf.parse(outDate), expenses);
                customers.add(x);
            }
            Collections.sort(customers, new Comparator<Customer>() {
                @Override
                public int compare(Customer c1, Customer c2) {
                    return (int) (c2.payPrice() - c1.payPrice());
                }
            });
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
        sc.close();
    }
}
