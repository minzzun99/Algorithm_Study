package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24087_IceCream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 250;

        if (s > a && (s - a) % b == 0) {
            sum += ((s - a) / b) * 100;
        } else if (s > a && (s - a) % b != 0) {
            sum += (((s - a) / b) + 1) * 100;
        }
        System.out.println(sum);
    }
}
