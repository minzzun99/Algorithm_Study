package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj29722_브실혜성 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        d += N;
        while (d > 30) {
            d -= 30;
            m++;
        }

        while (m > 12) {
            m -= 12;
            y++;
        }

        System.out.printf("%d-%02d-%02d%n", y, m, d);
    }
}
