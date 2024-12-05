package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6131_완전제곱수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int B = 1; B <= 500; B++) {
            for (int A = B + 1; A <= 500; A++) {
                if (A * A - B * B == N) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
