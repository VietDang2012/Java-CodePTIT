package J06004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String id = scanner.nextLine();
            String name = scanner.nextLine().trim();
            String phoneNumber = scanner.nextLine().trim();
            String group = scanner.nextLine();
            students.add(new Student(id, name, phoneNumber, group));
        }

        Task[] tasks = new Task[M];
        for (int i = 0; i < M; i++) {
            String taskName = scanner.nextLine().trim();
            tasks[i] = new Task(taskName);
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getId().compareTo(s2.getId());
            }
        });
        for (Student student : students) {
            int groupIdx = Integer.parseInt(student.getGroup()) - 1;
            System.out.println(student + " " + student.getGroup() + " " + tasks[groupIdx]);
        }
        scanner.close();
    }
}
