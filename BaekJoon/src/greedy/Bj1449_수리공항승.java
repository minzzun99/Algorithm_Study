package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1449_수리공항승 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] location = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(location);
        int range = (int) (location[0] + L - 0.5);
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (location[i] > range) {
                range = (int) (location[i] + L - 0.5);
                count++;
            }
        }

        System.out.println(count);
    }
}
