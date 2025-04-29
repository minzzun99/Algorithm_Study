package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10833_사과 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int sum = 0;

        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int student = Integer.parseInt(st.nextToken());
            int apple = Integer.parseInt(st.nextToken());
            sum += apple % student;
        }
        System.out.println(sum);
    }
}
