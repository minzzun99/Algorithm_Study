package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj8558_Silnia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i = 1; i <= N; i++) {
            result *= i;
            result = result % 10;
        }
        System.out.println(result);
    }
}
