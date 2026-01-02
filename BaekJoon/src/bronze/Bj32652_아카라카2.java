package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32652_아카라카2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("AKARAKA");
        int K = Integer.parseInt(br.readLine());

        sb.append("RAKA".repeat(Math.max(0, K - 1)));
        System.out.println(sb);
    }
}
