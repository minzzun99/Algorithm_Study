package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a > b) {
                sb.append("#").append(i).append(" ").append(">").append('\n');
            }else if(a < b) {
                sb.append("#").append(i).append(" ").append("<").append('\n');
            }else {
                sb.append("#").append(i).append(" ").append("=").append('\n');
            }
        }
        System.out.print(sb);
    }
}
