package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj18698_TheWalkingAdam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String s = br.readLine();
            int count = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'D') {
                    break;
                }
                count++;
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
