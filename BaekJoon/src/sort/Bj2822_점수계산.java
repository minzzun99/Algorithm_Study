package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Bj2822_점수계산 {
    private static class Problem {
        int num;
        int score;

        Problem(int num, int score) {
            this.num = num;
            this.score = score;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Problem[] problems = new Problem[8];
        for (int i = 1; i <= 8; i++) {
            problems[i - 1] = new Problem(i, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(problems, ((o1, o2) -> {
            return o2.score - o1.score;
        }));

        int sum = 0;
        int[] problemNUm = new int[5];
        for (int i = 0; i < 5; i++) {
            sum += problems[i].score;
            problemNUm[i] = problems[i].num;
        }
        Arrays.sort(problemNUm);
        sb.append(sum).append('\n');
        for (int i = 0; i < 5; i++) {
            sb.append(problemNUm[i]).append(' ');
        }
        System.out.println(sb);
    }
}
