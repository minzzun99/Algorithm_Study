package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj20833_Kuber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 0;
        for (int i = 1; i <= N; i++) {
            result += Math.pow(i, 3);
        }
        System.out.println(result);
    }
}
