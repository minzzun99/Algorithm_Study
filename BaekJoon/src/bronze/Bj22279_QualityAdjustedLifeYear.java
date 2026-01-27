package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj22279_QualityAdjustedLifeYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        double total = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            double q = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            total += q * y;
        }
        System.out.printf("%.3f", total);
    }
}
