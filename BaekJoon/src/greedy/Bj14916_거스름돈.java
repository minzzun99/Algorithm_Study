package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14916_거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int five = N / 5;
        int min = Integer.MAX_VALUE;

        for (int i = five; i >= 0; i--) {
            int num = N - (i * 5);
            if (num % 2 == 0) {
                int count = i + (num / 2);
                min = Math.min(min, count);
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
