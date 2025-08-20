package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5355_화성수학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            while (st.hasMoreTokens()) {
                String input = st.nextToken();
                if (input.equals("@")) {
                    num *= 3;
                } else if (input.equals("%")) {
                    num += 5;
                } else if (input.equals("#")) {
                    num -= 7;
                }
            }
            sb.append(String.format("%.2f", num)).append('\n');
        }
        System.out.println(sb);
    }
}
