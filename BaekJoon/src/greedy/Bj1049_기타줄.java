package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1049_기타줄 {
    private static int minSetPrice = Integer.MAX_VALUE;
    private static int minOnePrice = Integer.MAX_VALUE;
    private static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int setCount = (N / 6) + 1;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int setPrice = Integer.parseInt(st.nextToken());
            int onePrice = Integer.parseInt(st.nextToken());

            minSetPrice = Math.min(minSetPrice, setPrice);
            minOnePrice = Math.min(minOnePrice, onePrice);
        }

        result = Math.min(Math.min(minSetPrice * setCount, minOnePrice * N),
                minSetPrice * (N / 6) + minOnePrice * (N % 6));

        System.out.println(result);
    }
}
