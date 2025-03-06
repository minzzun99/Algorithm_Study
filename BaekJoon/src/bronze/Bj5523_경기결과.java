package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5523_경기결과 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int scoreA = Integer.parseInt(st.nextToken());
            int scoreB = Integer.parseInt(st.nextToken());

            if (scoreA > scoreB) {
                A++;
            } else if (scoreB > scoreA) {
                B++;
            }
        }

        System.out.println(A + " " + B);
    }
}
