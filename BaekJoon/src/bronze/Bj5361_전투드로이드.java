package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5361_전투드로이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            double A = Double.parseDouble(st.nextToken());
            double B = Double.parseDouble(st.nextToken());
            double C = Double.parseDouble(st.nextToken());
            double D = Double.parseDouble(st.nextToken());
            double E = Double.parseDouble(st.nextToken());
            double result = (A * 350.34) + (B * 230.90) + (C * 190.55) + (D * 125.30) + (E * 180.90);

            sb.append(String.format("$%.2f\n", result));
        }

        System.out.println(sb);
    }
}
