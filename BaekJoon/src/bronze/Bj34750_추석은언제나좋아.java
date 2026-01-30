package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34750_추석은언제나좋아 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cost = 0;
        if (N >= 1_000_000) {
            cost = (int) (N * 0.2);
        } else if (N >= 500_000) {
            cost = (int) (N * 0.15);
        } else if (N >= 100_000) {
            cost = (int) (N * 0.1);
        } else {
            cost = (int) (N * 0.05);
        }

        System.out.println(cost + " " + (N - cost));
    }
}
