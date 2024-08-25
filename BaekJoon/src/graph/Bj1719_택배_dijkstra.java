package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1719_택배_dijkstra {
    private static ArrayList<Node>[] adjList;
    private static int[][] courseArr;
    private static int N, M;
    public static final int INF = Integer.MAX_VALUE;

    private static class Node {
        int dest;
        int cost;

        Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }
        courseArr = new int[N + 1][N + 1];

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adjList[start].add(new Node(end, cost));
            adjList[end].add(new Node(start, cost));
        }

        for (int i = 1; i <= N; i++) {
            dijkstra(new Node(i, 0));
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (courseArr[i][j] == INF) {
                    sb.append('-').append(' ');
                    continue;
                }
                sb.append(courseArr[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void dijkstra(Node start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        pq.add(start);
        int[] dist = new int[N + 1];
        int[] firstVisit = new int[N + 1]; // 첫 번째 방문 노드를 저장

        Arrays.fill(dist, INF);
        for (int i = 1; i <= N; i++) {
            if (i == start.dest) {
                firstVisit[i] = 0;
            }
            firstVisit[i] = i;
        }

        dist[start.dest] = 0;

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > dist[now.dest] + next.cost) {
                    dist[next.dest] = dist[now.dest] + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));

                    // 첫번째로 방문한 노드를 저장
                    if (now.dest == start.dest) {
                        continue;
                    }
                    firstVisit[next.dest] = firstVisit[now.dest];
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            if (start.dest == i) {
                courseArr[start.dest][i] = INF;
            } else {
                courseArr[start.dest][i] = firstVisit[i];
            }
        }
    }
}
