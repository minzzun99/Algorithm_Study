package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            String year = str.substring(0, 4);
            String month = str.substring(4, 6);
            String day = str.substring(6, 8);

            if (Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12 && Integer.parseInt(day) >= 0
                    && Integer.parseInt(day) <= days[Integer.parseInt(month)]) {
                sb.append("#").append(i + 1).append(" ").append(year).append("/").append(month).append("/").append(day).append('\n');
            } else {
                sb.append("#").append(i + 1).append(" ").append(-1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
