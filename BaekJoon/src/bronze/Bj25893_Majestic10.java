package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj25893_Majestic10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int check = 0;
            if (a >= 10) {
                check++;
            }
            if (b >= 10) {
                check++;
            }
            if (c >= 10) {
                check++;
            }

            String result = switch (check) {
                case 3 -> "triple-double\n";
                case 2 -> "double-double\n";
                case 1 -> "double\n";
                default -> "zilch\n";
            };

            sb.append(String.format("%d %d %d\n", a, b, c));
            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
}
