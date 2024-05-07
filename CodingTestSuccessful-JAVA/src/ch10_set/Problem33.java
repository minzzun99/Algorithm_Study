package ch10_set;

import java.util.Arrays;

public class Problem33 {
    static int[] parent;

    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);

        parent[y] = x;
    }

    public static int solution(int n, int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> Integer.compare(o1[2], o2[2]));      // 다리 건설 비용의 오름차순으로 정렬
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int costSum = 0;
        int edges = 0;

        for (int[] edge : costs) {
            if (edges == n - 1) {
                break;
            }
            if (find(edge[0]) != find(edge[1])) {
                union(edge[0], edge[1]);
                costSum += edge[2];
                edges++;
            }
        }
        return costSum;
    }
}
