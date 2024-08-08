package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj14938_서강그라운드 {
    private static class Node {
        int idx;
        int length;

        Node(int idx, int length) {
            this.idx = idx;
            this.length = length;
        }
    }

    private static int[] items;
    private static int[] dist;
    private static boolean[] visited;
    private static ArrayList<Node>[] adjList;
    private static final int INF = Integer.MAX_VALUE;
    private static int n, m, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        items = new int[n + 1];
        adjList = new ArrayList[n + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < items.length; i++) {
            items[i] = Integer.parseInt(st.nextToken());
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            adjList[start].add(new Node(end, length));
            adjList[end].add(new Node(start, length));
        }

        int result = 0;
        for (int i = 1; i < items.length; i++) {
            int count = countItems(i);
            result = Math.max(result, count);
        }
        System.out.println(result);
    }

    private static int countItems(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.length, o2.length));
        dist = new int[n + 1];
        Arrays.fill(dist, INF);
        visited = new boolean[n + 1];
        dist[start] = 0;
        pq.add(new Node(start, dist[start]));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int x = now.idx;
            if (!visited[x]) {
                visited[x] = true;
                for (Node next : adjList[x]) {
                    int nx = next.idx;
                    if (!visited[nx] && dist[nx] > dist[x] + next.length) {
                        dist[nx] = dist[x] + next.length;
                        pq.add(new Node(nx, dist[nx]));
                    }
                }
            }
        }

        int sum = 0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] <= m) {
                sum += items[i];
            }
        }
        return sum;
    }
}
