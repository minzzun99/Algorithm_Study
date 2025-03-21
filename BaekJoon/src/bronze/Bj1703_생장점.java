package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1703_생장점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            if(N == 0) {
                break;
            }

            int tree = 1;
            for(int i = 0; i < 2 * N; i++) {
                int M = Integer.parseInt(st.nextToken());
                if(i % 2 == 0) {
                    tree *= M;
                }else {
                    tree -= M;
                }
            }
            sb.append(tree).append('\n');
        }

        System.out.println(sb);
    }
}
