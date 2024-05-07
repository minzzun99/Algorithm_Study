package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());       // 고정비용
        int b = Integer.parseInt(st.nextToken());       // 가변비용
        int c = Integer.parseInt(st.nextToken());       // 판매 가격

        if (b >= c) {
            System.out.println(-1);
            return;
        }

        System.out.println(a / (c - b) + 1);
    }
}
