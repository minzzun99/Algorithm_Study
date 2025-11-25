package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11586_지영공주님의마법거울 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if(K == 1) {
            for(int i = 0; i < N; i++) {
                sb.append(arr[i]);
                if(i + 1 < N) {
                    sb.append("\n");
                }
            }
        }
        if(K == 2) {
            for(int i = 0; i < N; i++) {
                sb.append(new StringBuilder(arr[i]).reverse());
                if(i + 1 < N) {
                    sb.append("\n");
                }
            }
        }
        if(K == 3) {
            for(int i = N - 1; i >= 0; i--) {
                sb.append(arr[i]);
                if(i > 0) {
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
