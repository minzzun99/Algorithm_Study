package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2858_기숙사바닥 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sum = R + B;
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < R; j++) {
                if (i * 2 + (j - 2) * 2 == R && (i - 2) * (j - 2) == B) {
                    sb.append(j).append(' ').append(i);
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}
