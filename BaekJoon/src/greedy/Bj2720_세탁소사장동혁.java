package greedy;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2720_세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] coin = {25, 10, 5, 1};

        while (T-- > 0) {
            int C = Integer.parseInt(br.readLine());
            int[] result = new int[4];
            for (int i = 0; i < 4; i++) {
                if (C / coin[i] >= 0) {
                    result[i] += C / coin[i];
                    C = C % coin[i];
                }
            }
            for (int i : result) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
