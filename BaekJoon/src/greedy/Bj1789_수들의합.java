package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1789_수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long num = 1;
        long count = 0;
        while (true) {
            if (N >= num) {
                N -= num;
                num++;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
