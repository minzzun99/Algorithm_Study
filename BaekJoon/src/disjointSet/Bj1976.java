package disjointSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1976 {
    static int[] parent;

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x > y) {
            parent[x] = y;
        } else {
            parent[y] = x;
        }
    }

    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());        //도시의 수
        int M = Integer.parseInt(br.readLine());        //여행 계획 도시 수
        StringTokenizer st;

        parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (num == 1) {
                    union(i, j);
                }
            }
        }
        st = new StringTokenizer(br.readLine(), " ");
        int start = find(Integer.parseInt(st.nextToken()));
        for (int i = 0; i < M - 1; i++) {
            int next = Integer.parseInt(st.nextToken());
            if (start != find(next)) {
                sb.append("NO\n");
                System.out.println(sb);
                return;
            }
        }
        sb.append("YES\n");
        System.out.println(sb);
    }
}
