package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj23057 {
    static int n, m;
    static boolean[] visited;
    static int[] arr;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            m += arr[i];
        }
        visited = new boolean[n];
        for (int i = 1; i <= n; i++) {
            makeNum(0, 0, i, 0);
        }

        System.out.println(m - set.size());
    }

    public static void makeNum(int index, int depth, int targetDepth, int sum) {
        if (depth == targetDepth) {
            set.add(sum);
            return;
        }
        for (int i = index; i < n; i++) {
            makeNum(i + 1, depth + 1, targetDepth, sum + arr[i]);
        }
    }
}
