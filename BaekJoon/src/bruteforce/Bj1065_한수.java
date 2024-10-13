package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1065_한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (i <= 99) {
                count++;
            } else if (i <= 999) {
                int a = i / 100;
                int b = (i % 100) / 10;
                int c = i % 10;
                if (b - a == c - b) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
