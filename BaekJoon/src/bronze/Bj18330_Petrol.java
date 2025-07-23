package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj18330_Petrol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int sum = 0;
        if (n - k <= 60) {
            sum = n * 1500;
        } else {
            sum = (k + 60) * 1500 + (n - 60 - k) * 3000;
        }
        System.out.println(sum);
    }
}
