package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj33612_피갤컵 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int year = 2024;
        int month = 8;
        for (int i = 0; i < N - 1; i++) {
            month += 7;
            if (month > 12) {
                month -= 12;
                year++;
            }
        }

        System.out.println(year + " " + month);
    }
}
