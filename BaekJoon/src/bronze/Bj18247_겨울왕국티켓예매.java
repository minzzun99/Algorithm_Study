package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj18247_겨울왕국티켓예매 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int result;
        while (T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A < 12 || B < 4){
                sb.append(-1).append("\n");
            }else{
                result = (12 * B) - (B - 4);
                sb.append(result).append("\n");
            }
        }
        System.out.println(sb);
    }
}
