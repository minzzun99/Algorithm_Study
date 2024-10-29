package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj11779_최소비용구하기2 {
    private static int N, M;
    private static int[] dist;
    private static List<Node>[] adjList;
    private static String result;
    private static int resultCount;

    private static class Node {
        int dest;
        int cost;
        String root;
        int size;

        Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        Node(int dest, int cost, String root, int size) {
            this.dest = dest;
            this.cost = cost;
            this.root = root;
            this.size = size;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        adjList = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            adjList[start].add(new Node(end, cost));
        }

        st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int dest = Integer.parseInt(st.nextToken());

        bfs(start, dest);

        System.out.println(dist[dest]);
        System.out.println(resultCount);
        System.out.println(result);
    }

    private static void bfs(int start, int dest) {
        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.cost - o2.cost;
        });
        dist[start] = 0;
        pq.add(new Node(start, 0, String.valueOf(start), 1));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (now.dest == dest) {
                result = now.root;
                resultCount = now.size;
                break;
            }

            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > dist[now.dest] + next.cost) {
                    dist[next.dest] = dist[now.dest] + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest], now.root + " " + next.dest, now.size + 1));
                }
            }
        }
    }
}
