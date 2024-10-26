package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj31872_강의실 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        Integer[] diff = new Integer[N + 1];
        diff[0] = 0;
        for (int i = 1; i <= N; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        Arrays.sort(diff, Collections.reverseOrder());
        int sum = 0;
        for (int i = K; i <= N; i++) {
            sum += diff[i];
        }

        System.out.println(sum);
    }
}

// 1 4 5 6 9 14
// 1 3 1 1 3 5
// 5 4 4 1 1 1
