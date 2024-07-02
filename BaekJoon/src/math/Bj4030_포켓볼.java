package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4030_포켓볼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num = 1;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            int count = 0;
            int triangle;
            for (int i = 2; i <= 44721; i++) {
                triangle = i * (i + 1) / 2;
                if (triangle > a - 1) {
                    if (triangle >= b - 1) {
                        break;
                    }

                    int square = triangle + 1;
                    if (square == Math.pow((int)Math.sqrt(square),2)) {
                        count++;
                    }
                }
            }
            sb.append("Case ").append(num).append(": ").append(count).append('\n');
            num++;
        }
        System.out.println(sb);
    }
}
