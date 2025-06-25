package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5217_쌍의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int count = 0;
            sb.append("Pairs for ").append(num).append(": ");
            for (int i = 1; i <= num; i++) {
                for (int j = i + 1; j <= num; j++) {
                    if (i + j == num) {
                        if (count >= 1) {
                            sb.append(", ");
                        }
                        sb.append(i).append(" ").append(j);
                        count++;
                    }
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
