package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2018_수들의합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int left = 1;
        int right = 1;
        int sum = 1;
        while (left <= right) {
            if (sum == N) {
                count++;
            }

            if (sum < N) {
                right++;
                sum += right;
            } else {
                sum -= left;
                left++;
            }
        }

        System.out.println(count);
    }
}
