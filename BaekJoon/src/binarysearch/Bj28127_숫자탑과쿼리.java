package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj28127_숫자탑과쿼리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Q = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int i = 1;
            int total = 1;

            while (true) {
                int sum = a + (i - 1) * d;
                if ((total + sum) > x) {
                    break;
                }
                total += sum;
                i++;
            }
            sb.append(i).append(" ").append(x - total + 1).append('\n');
        }
        System.out.println(sb);
    }
}
