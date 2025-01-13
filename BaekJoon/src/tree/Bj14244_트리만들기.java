package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14244_트리만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        if (M == 2) {
            count = 1;
        }
        int node = 0;
        for (int i = 1; i < N; i++) {
            if (M > count) {
                sb.append(0).append(' ').append(i).append('\n');
                count++;
            } else {
                sb.append(node).append(' ').append(i).append('\n');
            }
            node = i;
        }

        System.out.println(sb);
    }
}
