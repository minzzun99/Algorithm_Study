package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj33163_OIJ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'J') {
                sb.append('O');
            } else if (S.charAt(i) == 'O') {
                sb.append('I');
            } else {
                sb.append("J");
            }
        }

        System.out.println(sb);
    }
}
