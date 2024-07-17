package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1009_분산처리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int computer = 1;
            for (int i = 0; i < b; i++) {
                computer = (computer * a) % 10;
            }
            if (computer == 0) {
                sb.append(10).append('\n');
            } else {
                sb.append(computer).append('\n');
            }
        }
        System.out.println(sb);
    }
}
