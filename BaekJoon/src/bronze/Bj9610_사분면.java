package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9610_사분면 {
    private static final String PRINT_FORMAT = "Q1: %d\n" +
            "Q2: %d\n" +
            "Q3: %d\n" +
            "Q4: %d\n" +
            "AXIS: %d";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int Q1 = 0, Q2 = 0, Q3 = 0, Q4 = 0, AXIS = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x == 0 || y == 0) {
                AXIS++;
            } else if (x > 0) {
                if (y > 0) {
                    Q1++;
                } else {
                    Q4++;
                }
            } else {
                if (y > 0) {
                    Q2++;
                } else {
                    Q3++;
                }
            }
        }

        System.out.println(String.format(PRINT_FORMAT, Q1, Q2, Q3, Q4, AXIS));
    }
}
