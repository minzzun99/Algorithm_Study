package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj18414_TheNearestValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int X = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int min_diff = Integer.MAX_VALUE;
        int result = 0;
        for(int i = L; i <= R; i++) {
            int diff = Math.abs(X - i);
            if(diff < min_diff) {
                min_diff = diff;
                result = i;
            }
        }
        System.out.println(result);
    }
}
