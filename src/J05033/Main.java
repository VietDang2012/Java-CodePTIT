package J05033;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] a = new Time[n];
        for (int i = 0; i < n; i++) {
            int hr = sc.nextInt();
            int mn = sc.nextInt();
            int s = sc.nextInt();
            a[i] = new Time(hr, mn, s);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].getTotalTime() > a[j].getTotalTime()) {
                    Time res = a[i];
                    a[i] = a[j];
                    a[j] = res;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i].getHr() + " " + a[i].getMn() + " " + a[i].getSc());
        }
        sc.close();
    }
}