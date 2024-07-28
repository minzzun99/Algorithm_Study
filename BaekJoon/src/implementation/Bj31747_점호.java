package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj31747_점호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int first = 0;
        int second = 0;
        int count = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (first + second < K - 1) {
                if (num == 1) {
                    first++;
                } else {
                    second++;
                }
                continue;
            }
            if (num == 1 && second > 0) {
                second--;
            } else if (num == 2 && first > 0) {
                first--;
            }
            count++;
        }
        count += Math.max(first, second);
        System.out.println(count);
    }
}
