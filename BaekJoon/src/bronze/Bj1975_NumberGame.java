package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1975_NumberGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int count = 0;
            int N = Integer.parseInt(br.readLine());
            for (int i = 2; i <= N; i++) {
                int num = N;
                while (true) {
                    if (num % i != 0) {
                        break;
                    }
                    count++;
                    num /= i;
                }
            }
            System.out.println(count);
        }
    }
}
