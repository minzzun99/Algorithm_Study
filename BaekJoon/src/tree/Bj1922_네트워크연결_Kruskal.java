package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1922_네트워크연결_Kruskal {
    private static PriorityQueue<Node> pq;
    private static int[] parent;

    private static class Node {
        int next;
        int prev;
        int cost;

        Node(int next,int prev, int cost) {
            this.next = next;
            this.prev = prev;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.cost, o2.cost);}
        );

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            pq.add(new Node(start, end, cost));
        }

        int result = 0;
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            Node now = pq.poll();
            int x = find(now.next);
            int y = find(now.prev);

            if (!isSameParent(x, y)) {
                union(x, y);
                result += now.cost;
            }
        }

        System.out.println(result);
    }

    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    private static void union(int x, int y) {
        if (find(x) != find(y)) {
            parent[y] = x;
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
