package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13305_주유소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long[] dist = new long[N - 1];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        long[] price = new long[N];
        for (int i = 0; i < price.length; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min = price[0];
        for (int i = 0; i < dist.length; i++) {
            if (price[i] < min) {
                min = price[i];
            }
            sum += (min * dist[i]);
        }

        System.out.println(sum);
    }
}
