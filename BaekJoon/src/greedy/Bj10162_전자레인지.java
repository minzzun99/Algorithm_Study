package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10162_전자레인지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;
        int C = 0;

        if (T >= 300) {
            A = T / 300;
            T %= 300;
        }

        if (T >= 60) {
            B = T / 60;
            T %= 60;
        }

        C = T / 10;

        if (T % 10 != 0) {
            sb.append(-1);
        } else {
            sb.append(A).append(' ').append(B).append(' ').append(C);
        }

        System.out.println(sb);
    }
}
