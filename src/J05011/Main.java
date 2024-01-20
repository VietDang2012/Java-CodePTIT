package J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Gamer> gamers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String startTime = sc.nextLine();
            String stopTime = sc.nextLine();
            try {
                long timePlayed = sdf.parse(stopTime).getTime() - sdf.parse(startTime).getTime();
                gamers.add(new Gamer(id, name, timePlayed));
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
        Collections.sort(gamers);
        for (Gamer i : gamers) {
            System.out.println(i);
        }
        sc.close();
    }
}
