package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28453_PreviousLevel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int input = Integer.parseInt(st.nextToken());
            if (input < 250) {
                sb.append(4).append(" ");
            } else if (input < 275) {
                sb.append(3).append(" ");
            } else if (input < 300) {
                sb.append(2).append(" ");
            } else {
                sb.append(1).append(" ");
            }
        }
        System.out.println(sb);
    }
}
