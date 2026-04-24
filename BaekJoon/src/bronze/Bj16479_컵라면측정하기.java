package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj16479_컵라면측정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D1 = Integer.parseInt(st.nextToken());
        int D2 = Integer.parseInt(st.nextToken());

        double r1 = D1 / 2.0;
        double r2 = D2 / 2.0;
        double height = Math.sqrt(K * K - Math.pow(r1 - r2, 2));
        System.out.println(height * height);
    }
}
