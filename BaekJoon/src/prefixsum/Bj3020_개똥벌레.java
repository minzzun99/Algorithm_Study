package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj3020_개똥벌레 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[] bot = new int[H + 2];
        int[] top = new int[H + 2];
        for (int i = 0; i < N / 2; i++) {
            int b = Integer.parseInt(br.readLine());
            int t = H - Integer.parseInt(br.readLine()) + 1;
            bot[b]++;
            top[t]++;
        }

        for (int i = 1; i <= H; i++) {
            bot[i] += bot[i - 1];
        }
        for (int i = H; i >= 1; i--) {
            top[i] += top[i + 1];
        }

        int min = N;
        int count = 0;
        for (int i = 1; i < H + 1; i++) {
            int num = (bot[H] - bot[i - 1]) + (top[1] - top[i + 1]);
            if (num < min) {
                min = num;
                count = 1;
            } else if (num == min) {
                count++;
            }
        }

        System.out.println(min + " " + count);
    }
}
