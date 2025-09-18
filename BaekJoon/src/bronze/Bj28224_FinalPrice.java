package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj28224_FinalPrice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        while (N-- > 0) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(sum);
    }
}
