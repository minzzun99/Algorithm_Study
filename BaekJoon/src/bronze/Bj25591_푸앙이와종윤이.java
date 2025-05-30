package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj25591_푸앙이와종윤이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int a = 100 - N;
        int b = 100 - M;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        int x = c;
        int y = d;
        if (d >= 100) {
            x = c + q;
            y = d % 100;
        }
        System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, q, r));
        System.out.println(x + " " + y);
    }
}
