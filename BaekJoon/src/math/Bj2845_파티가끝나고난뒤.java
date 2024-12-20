package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2845_파티가끝나고난뒤 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int sum = L * P;
        String[] arr = new String[5];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = String.valueOf(num - sum);
        }

        System.out.println(String.join(" ", arr));
    }
}
