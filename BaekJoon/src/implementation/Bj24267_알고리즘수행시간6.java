package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24267_알고리즘수행시간6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        System.out.println((N * (N - 1) * (N - 2) / 6));
        System.out.println(3);
    }
}
