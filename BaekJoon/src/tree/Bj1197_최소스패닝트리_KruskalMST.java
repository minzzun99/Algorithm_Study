package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1197_최소스패닝트리_KruskalMST {
    private static int V, E;
    private static PriorityQueue<Node> pq;
    private static int[] parent;

    private static class Node {
        int nextNode;
        int prevNode;
        int cost;

        Node(int nextNode,int prevNode, int cost) {
            this.nextNode = nextNode;
            this.prevNode = prevNode;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        parent = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            parent[i] = i;
        }

        pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.cost, o2.cost);});
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            pq.add(new Node(start, end, cost));
        }

        int size = pq.size();
        int result = 0;
        for (int i = 0; i < size; i++) {
            Node now = pq.poll();
            int x = find(now.nextNode);
            int y = find(now.prevNode);

            if (!isSameParent(x, y)) {
                result += now.cost;
                union(x, y);
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
