package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj9237_이장님초대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer[] tree = new Integer[N];
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tree, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            tree[i] = (i + 1) + tree[i];
        }

        Arrays.sort(tree, Collections.reverseOrder());
        System.out.println(tree[0] + 1);
    }
}
