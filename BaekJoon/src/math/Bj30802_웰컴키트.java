package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30802_웰컴키트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] size = new int[6];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < size.length; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int tCount = 0;
        for (int i = 0; i < size.length; i++) {
            tCount += (size[i] / T);
            if (size[i] % T > 0) {
                tCount++;
            }
        }
        sb.append(tCount).append('\n');
        sb.append(N / P).append(' ').append(N % P);
        System.out.println(sb);
    }
}
