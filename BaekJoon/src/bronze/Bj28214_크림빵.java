package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28214_크림빵 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] arr = new int[N * K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = N;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for(int j = 0; j < K; j++) {
                if (arr[i * K + j] == 0) {
                    count++;
                }
            }

            if (count >= P) {
                result--;
            }
        }

        System.out.println(result);
    }
}
