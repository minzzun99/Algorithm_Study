package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14920_3n_Plus_1수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(1);
        } else {
            int count = 1;
            int num = 0;
            while (true) {
                if (num == 1) {
                    System.out.println(count);
                    break;
                }

                if (N % 2 == 0) {
                    num = N / 2;
                } else {
                    num = 3 * N + 1;
                }

                N = num;
                count++;
            }
        }
    }
}
