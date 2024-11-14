package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj32200_항해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int div = arr[i] / X;
            count += div;
            int gap = div * (Y - X);

            if (arr[i] < X) {
                sum += arr[i];
            } else if (gap < (arr[i] % X)) {
                int temp = 0;
                if (div != 1) {
                    temp = arr[i] / (div - 1) - 1;
                }
                if (temp < X || temp > Y) {
                    temp = Y;
                }
                sum += arr[i] % temp;
            }
        }

        System.out.println(count);
        System.out.println(sum);

    }
}
