package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30404_오리와박수치는춘배 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int last = 0;
        int count = 1;
        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(st.nextToken());
            if (i == 0) {
                last = X;
            }
            if (last + K < X) {
                count++;
                last = X;
            }
        }
        System.out.println(count);
    }
}
