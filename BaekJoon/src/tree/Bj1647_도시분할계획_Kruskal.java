package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1647_도시분할계획_Kruskal {
    private static int N, M;
    private static PriorityQueue<Node> pq;
    private static int[] parent;

    private static class Node {
        int prev;
        int next;
        int cost;

        Node(int prev, int next, int cost) {
            this.prev = prev;
            this.next = next;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.cost, o2.cost);
        });

        parent = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            pq.add(new Node(start, end, cost));
        }

        int result = 0;
        int max = 0;
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            Node now = pq.poll();
            int x = find(now.prev);
            int y = find(now.next);
            if (!isSameParent(x, y)) {
                result += now.cost;
                union(x, y);
                max = Math.max(max, now.cost);
            }
        }

        System.out.println(result - max);
    }

    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    private static void union(int x, int y) {
        if (find(x) != find(y)) {
            parent[y] = parent[x];
        }
    }

    private static boolean isSameParent(int x, int y) {
        if (find(x) == find(y)) {
            return true;
        } else {
            return false;
        }
    }
}
