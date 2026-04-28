package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13305_주유소2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] dist = new long[N - 1];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        long[] cost = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cost.length; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long min = cost[0];
        long sum = 0;
        for (int i = 0; i < dist.length; i++) {
            if (cost[i] < min) {
                min = cost[i];
            }
            sum += dist[i] * min;
        }

        System.out.println(sum);
    }
}
