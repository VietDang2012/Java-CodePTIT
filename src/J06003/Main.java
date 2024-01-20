package J06003;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Task> tasks = new ArrayList<>();
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            Student x = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            students.add(x);
        }
        while (m-- > 0) {
            Task x = new Task(sc.nextLine().trim());
            tasks.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH NHOM " + s + ":");
            for (Student student : students) {
                if (student.getGroup().equals(s)) {
                    System.out.println(student);
                }
            }
            for (Task task : tasks) {
                if (task.getId().equals(s)) {
                    System.out.println("Bai tap dang ky: " + task.getName());
                }
            }
        }
        sc.close();
    }
}
