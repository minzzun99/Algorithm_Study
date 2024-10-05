package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj28352_10fac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long factorial = 1L;

        for (long i = 1L; i <= N; i++) {
            factorial *= i;
        }

        System.out.println(factorial / (7 * 24 * 60 * 60));
    }
}