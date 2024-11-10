package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2851_슈퍼마리오 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[11];
        for (int i = 1; i < 11; i++) {
            arr[i] = Integer.parseInt(br.readLine()) + arr[i - 1];
        }

        int value = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 1; i < 11; i++) {
            if (value >= Math.abs(100 - arr[i])) {
                value = Math.abs(100 - arr[i]);
                result = arr[i];
            }
        }

        System.out.println(result);
    }
}
