package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30791_gahuiandsousenkyo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        arr[3] = Integer.parseInt(st.nextToken());
        arr[4] = Integer.parseInt(st.nextToken());
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] - 1000 <= arr[i]) {
                result++;
            }
        }

        System.out.println(result);
    }
}
