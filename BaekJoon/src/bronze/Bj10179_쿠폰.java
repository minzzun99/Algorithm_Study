package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10179_쿠폰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            double cost = Double.parseDouble(br.readLine());
            sb.append(String.format("$%.2f\n", cost * 0.8));
        }
        System.out.println(sb);
    }
}
