package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Bj13333_Q인덱스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] >= i + 1) {
                result = i + 1;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}

