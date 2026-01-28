package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj34935_오름차순과비내림차순 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        boolean flag = true;
        for (int i = 1; i < N; i++) {
            if (arr[i] <= arr[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
