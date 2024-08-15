package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1964_오각형X3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long dot = 7;
        long result = 5;

        for(int i = 1; i < N; i++) {
            result += dot;
            dot += 3;
        }
        System.out.println(result % 45678);
    }
}
