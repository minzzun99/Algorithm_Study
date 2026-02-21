package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj35277_유림이와하람이의두쫀쿠대작전 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = 900 + 60 + 600 + 170 + 160 + 110;
        int N = Integer.parseInt(br.readLine());
        System.out.println(N / cost);
    }
}
