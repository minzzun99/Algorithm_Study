package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj8760_Schronisko {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Z = Integer.parseInt(br.readLine());
        while (Z-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int W = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            sb.append(W * K / 2).append('\n');
        }
        System.out.println(sb);
    }
}
