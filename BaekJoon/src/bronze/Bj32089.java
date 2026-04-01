package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj32089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int num, sum, max;
        int[] arr;
        StringTokenizer st;
        while (!(str = br.readLine()).equals("0")) {
            num = Integer.parseInt(str);
            arr = new int[num];
            max = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < num - 2; i++) {
                sum = arr[i] + arr[i + 1] + arr[i + 2];
                max = Math.max(max, sum);
            }

            sb.append(max).append("\n");
        }

        System.out.println(sb);
    }
}
