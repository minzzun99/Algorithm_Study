package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15667_2018연세대학교프로그래밍경진대회 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int K = 0;
        while (true) {
            if (N == (1 + K + K * K)) {
                break;
            }
            K++;
            if (K > 100) {
                break;
            }
        }
        System.out.println(K);
    }
}
