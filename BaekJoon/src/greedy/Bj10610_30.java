package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10610_30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);

        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i] - '0';
            sb.append(arr[i]);
        }

        if (arr[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(sb);
        }
    }
}
