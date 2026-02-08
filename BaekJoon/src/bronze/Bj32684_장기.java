package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Bj32684_장기 {
    private static final List<Integer> scores = List.of(13, 7, 5, 3, 3, 2);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double cho = calculateScore(br.readLine());
        double han = calculateScore(br.readLine()) + 1.5;

        if (cho > han) {
            System.out.println("cocjr0208");
        } else {
            System.out.println("ekwoo");
        }
    }

    private static double calculateScore(String input) {
        StringTokenizer st = new StringTokenizer(input);
        int score = 0;
        for (int i = 0; i < 6; i++) {
            int count = Integer.parseInt(st.nextToken());
            score += count * scores.get(i);
        }

        return score;
    }
}
