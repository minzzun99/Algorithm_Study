package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1748_수이어쓰기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int addNumber = 1;
        int digits = 10;
        for (int i = 1; i <= N; i++) {
            if (i % digits == 0) {
                addNumber++;
                digits *= 10;
            }
            count += addNumber;
        }

        System.out.println(count);
    }
}
