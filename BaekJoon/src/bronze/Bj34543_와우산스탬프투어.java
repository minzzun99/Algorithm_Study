package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34543_와우산스탬프투어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());
        int score = N * 10;
        if (N >= 3) {
            score += 20;
            if (N == 5) {
                score += 50;
            }
        }

        if (W > 1000) {
            score -= 15;
        }

        System.out.println(Math.max(0, score));
    }
}
