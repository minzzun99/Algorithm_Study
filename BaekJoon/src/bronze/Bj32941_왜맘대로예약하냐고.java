package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj32941_왜맘대로예약하냐고 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            boolean flag = false;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                int A = Integer.parseInt(st.nextToken());
                if (A == X) {
                    flag = true;
                }
            }
            if (flag) {
                count++;
            }
        }

        if (count == N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
