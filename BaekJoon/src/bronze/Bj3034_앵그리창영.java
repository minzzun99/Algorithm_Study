package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj3034_앵그리창영 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int diagonal = (int) Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
        while (N-- > 0) {
            int l = Integer.parseInt(br.readLine());
            if (l <= diagonal) {
                sb.append("DA\n");
            } else {
                sb.append("NE\n");
            }
        }
        System.out.println(sb);
    }
}
