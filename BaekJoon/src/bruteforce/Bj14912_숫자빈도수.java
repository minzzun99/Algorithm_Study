package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14912_숫자빈도수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 1; i <= N; i++) {
            String num = String.valueOf(i);
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) - '0' == D) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
