package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4619_루트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            if(B == 0 && N == 0) break;

            int x = 0;
            int y = 0;
            int A = 0;
            while (true) {
                if (Math.pow(A, N) <= B) {
                    x = A;
                } else if (Math.pow(A, N) > B) {
                    y = A;
                    break;
                }
                A++;
            }

            sb.append((Math.abs(Math.pow(x, N) - B) <= Math.abs(Math.pow(y, N) - B)) ? x : y).append("\n");
        }
        System.out.println(sb);
    }
}
