package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj2799_블라인드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] window = new int[5];
        char[][] apart = new char[(5 * M) + 1][(5 * N) + 1];
        for (int i = 0; i < apart.length; i++) {
            apart[i] = br.readLine().toCharArray();
        }

        int x = 1;
        while (M-- > 0) {
            int y = 1;
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = x; j < x + 4; j++) {
                    for (int k = y; k < y + 4; k++) {
                        if (apart[j][k] == '*') {
                            count++;
                        }
                    }
                }
                window[count / 4]++;
                y += 5;
            }
            x += 5;
        }

        for (int i = 0; i < window.length; i++) {
            sb.append(window[i]).append(' ');
        }
        System.out.println(sb);
    }
}
