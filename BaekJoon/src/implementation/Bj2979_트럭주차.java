package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2979_트럭주차 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int answer = 0;
        int[] time = new int[100];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = start-1; j < end-1; j++) {
                time[j]++;
            }
        }

        for (int i : time) {
            if (i == 1) {
                answer += i * A;
            } else if (i == 2) {
                answer += i * B;
            } else if (i == 3) {
                answer += i * C;
            }
        }
        System.out.println(answer);
    }
}
