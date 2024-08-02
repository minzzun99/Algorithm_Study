package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5046_전대프연 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int min_cost = B + 1;

        for (int i = 0; i < H; i++) {
            int cost = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < W; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (a >= N) {
                    if (cost * N <= B) {
                        min_cost = Math.min(min_cost, cost * N);
                    }
                }
            }
        }

        if (min_cost == B + 1) {
            System.out.println("stay home");
        } else {
            System.out.println(min_cost);
        }
    }
}
