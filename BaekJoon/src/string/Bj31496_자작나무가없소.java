package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj31496_자작나무가없소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken();

        int sum = 0;
        StringTokenizer st2;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            st2 = new StringTokenizer(st.nextToken(), "_");
            while (st2.hasMoreTokens()) {
                if (st2.nextToken().equals(S)) {
                    sum += Integer.parseInt(st.nextToken());
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}
