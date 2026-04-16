package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj27960_사격내기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;
        int score = 512;
        while (score > 0) {
            int cnt = 0;
            if (a >= score) {
                cnt++;
                a -= score;
            }
            if (b >= score) {
                cnt++;
                b -= score;
            }
            if (cnt == 1) {
                sum += score;
            }

            score >>= 1;
        }
        System.out.println(sum);
    }
}
