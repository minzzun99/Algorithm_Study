package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj5800_성적통계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N, max, min;
        int[] student;
        int K = Integer.parseInt(br.readLine());
        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            student = new int[N];
            for (int j = 0; j < N; j++) {
                student[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(student);
            max = student[N - 1];
            min = student[0];
            int gap = 0;
            for (int j = 0; j < N - 1; j++) {
                gap = Math.max(gap, student[j + 1] - student[j]);
            }
            sb.append("Class").append(i).append('\n');
            sb.append("Max ").append(max).append(", ")
                    .append("Min ").append(min).append(", ")
                    .append("Largest gap ").append(gap).append('\n');
        }
        System.out.println(sb);
    }
}
