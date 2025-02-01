package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5575_타임카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());

            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());

            int start = (h1 * 3600) + (m1 * 60) + s1;
            int end = (h2 * 3600) + (m2 * 60) + s2;
            int time = end - start;
            int resultH = time / 3600;
            int resultM = (time % 3600) / 60;
            int resultS = time % 3600 % 60;
            sb.append(resultH + " " + resultM + " " + resultS + "\n");
        }

        System.out.println(sb);
    }
}
