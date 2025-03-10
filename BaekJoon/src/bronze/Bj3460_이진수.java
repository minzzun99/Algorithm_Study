package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3460_이진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String s = Integer.toBinaryString(N);
            sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                if(s.charAt(i) == '1'){
                    sb.append(s.length() - i - 1).append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
