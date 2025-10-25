package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14909_양수개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if (a > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
