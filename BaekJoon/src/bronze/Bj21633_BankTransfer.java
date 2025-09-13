package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj21633_BankTransfer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        double result = k * 0.01 + 25;
        if (result > 2000) {
            System.out.println(2000);
        } else if (result < 100) {
            System.out.println(100);
        } else {
            System.out.println(result);
        }
    }
}
