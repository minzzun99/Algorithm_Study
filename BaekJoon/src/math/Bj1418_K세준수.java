package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1418_K세준수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        boolean arr[] = new boolean[100001];
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (!arr[i]) {
                for (int j = i + i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        int count = 1;
        for (int i = 2; i <= N; i++) {
            if (arr[i]) {
                int temp = 2;
                int num = i;
                int max = -1;
                while (true) {
                    if (num % temp == 0) {
                        num /= temp;
                        max = Math.max(max, temp);
                    } else {
                        temp++;
                    }
                    if (temp > num || !arr[num]) {
                        max = Math.max(max, num);
                        break;
                    }
                }
                if (max <= K) {
                    count += 1;
                }
            } else {
                if (i <= K) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
