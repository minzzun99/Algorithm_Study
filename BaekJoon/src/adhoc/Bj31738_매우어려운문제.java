package adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj31738_매우어려운문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        System.out.println(getResult(N, M));
    }

    private static long getResult(long N, long M) {
        if (N >= M) {
            return 0;
        }

        long result = 1;
        for(long i = N; i > 0; i--) {
            result = (result * i) % M;
        }
        return result;
    }
}
