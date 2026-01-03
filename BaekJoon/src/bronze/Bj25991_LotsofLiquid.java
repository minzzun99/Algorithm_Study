package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj25991_LotsofLiquid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            double c = Double.parseDouble(st.nextToken());
            sum += Math.pow(c, 3);
        }
        System.out.println(Math.cbrt(sum));
    }
}
