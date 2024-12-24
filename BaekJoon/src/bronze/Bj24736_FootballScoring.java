package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj24736_FootballScoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = {6, 3, 2, 1, 2};
        int home = 0;
        int away = 0;

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++) {
            home += score[i] * Integer.parseInt(st1.nextToken());
            away += score[i] * Integer.parseInt(st2.nextToken());
        }

        System.out.println(home + " " + away);
    }
}
