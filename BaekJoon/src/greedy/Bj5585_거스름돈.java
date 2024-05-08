package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5585_거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(br.readLine());
        int change = 1000 - pay;
        int[] money = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int i : money) {
            if (change / i > 0) {
                count += change / i;
                change = change % i;
            }
        }
        System.out.println(count);
    }
}
