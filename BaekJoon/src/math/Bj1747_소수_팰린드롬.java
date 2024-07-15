package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1747_소수_팰린드롬 {
    private static final int NUM = 1003002;     // 1000000보다 큰 소수도 출력 가능 1003001은 소수&팰린드롬
    private static boolean[] arr = new boolean[NUM];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr[1] = true;
        for (int i = 2; i < Math.sqrt(NUM); i++) {
            if (!arr[i]) {
                for (int j = i * i; j < NUM; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = N; i < NUM; i++) {
            if (!arr[i]) {
                if (isPalindrome(i)) {
                    sb.append(i);
                    break;
                }
            }
        }
        System.out.println(sb);
    }

    private static boolean isPalindrome(int i) {
        String str = String.valueOf(i);
        StringBuilder reverseSb = new StringBuilder(str);
        String reverseStr = reverseSb.reverse().toString();
        if (str.equals(reverseStr)) {
            return true;
        } else {
            return false;
        }
    }
}
