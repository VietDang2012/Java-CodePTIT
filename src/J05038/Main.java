package J05038;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Employee> employees = new ArrayList<>();
        while (n-- > 0) {
            Employee x = new Employee(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()),
                    sc.nextLine());
            employees.add(x);
        }
        long total = 0;
        for (Employee x : employees) {
            total += x.getTotal();
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: " + total);
        sc.close();
    }
}
