package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3507_AutomatedTelephoneExchange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        if (N <= 198) {
            for (int i = 1; i < 100; i++) {
                for (int j = 1; j < 100; j++) {
                    if (i + j == N) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
