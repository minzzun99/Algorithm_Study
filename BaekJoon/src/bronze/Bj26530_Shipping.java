package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj26530_Shipping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            double sum = 0;
            while (x-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int count = Integer.parseInt(st.nextToken());
                double cost = Double.parseDouble(st.nextToken());
                sum += count * cost;
            }
            System.out.println(String.format("$%.2f", sum));
        }
    }
}
