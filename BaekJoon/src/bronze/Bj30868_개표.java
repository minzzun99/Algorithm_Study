package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj30868_개표 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int a = n / 5;
            int b = n % 5;
            for (int i = 0; i < a; i++) {
                sb.append("++++ ");
            }
            for(int i = 0; i < b; i++) {
                sb.append("|");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
