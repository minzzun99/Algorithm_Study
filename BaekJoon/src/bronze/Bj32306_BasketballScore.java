package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj32306_BasketballScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] first = new int[3];
        int[] second = new int[3];
        for (int i = 0; i < first.length; i++) {
            first[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < first.length; i++) {
            second[i] = Integer.parseInt(st.nextToken());
        }

        int team1 = 0;
        int team2 = 0;
        for(int i = 0; i < 3; i++) {
            team1 += first[i] * (i + 1);
            team2 += second[i] * (i + 1);
        }

        if (team1 > team2) {
            System.out.println("1");
        } else if (team1 < team2) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
