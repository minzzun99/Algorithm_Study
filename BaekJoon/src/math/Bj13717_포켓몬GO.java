package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13717_포켓몬GO {
    private static String result;
    private static int totalCount;
    private static int maxCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String name = br.readLine();
            st = new StringTokenizer(br.readLine(), " ");
            int K = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            setEvolution(name, K, P);
        }

        System.out.println(totalCount);
        System.out.println(result);
    }

    private static void setEvolution(String name, int k, int p) {
        int count = 0;
        while (p >= k) {
            p = p - k + 2;
            count++;
        }

        if (maxCount < count) {
            result = name;
            maxCount = count;
        }

        totalCount += count;
    }
}
