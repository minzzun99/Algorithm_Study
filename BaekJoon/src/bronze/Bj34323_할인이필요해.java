package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj34323_할인이필요해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        long cost1 = (S * (100 - N) * (M + 1)) / 100;
        long cost2 = S * M;
        System.out.println(Math.min(cost1, cost2));
    }
}
