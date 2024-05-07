package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1916 {
    public static class Node {
        int dest;       // 목적지
        int cost;       // 비용
        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());        // 도시의 수
        int m = Integer.parseInt(br.readLine());        // 버스 개수

        ArrayList<Node>[] adjList = new ArrayList[n + 1];
        // 인접리스트 초기화
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());      // 출발 도시 번호
            int b = Integer.parseInt(st.nextToken());      // 도착 도시 번호
            int c = Integer.parseInt(st.nextToken());      // 버스 비용

            adjList[a].add(new Node(b, c));
        }

        int[] dist = new int[n + 1];        // 최소 비용 저장
        for (int i = 1; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());       // 출발 도시
        int end = Integer.parseInt(st.nextToken());         // 도착 도시

        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(((o1, o2) -> Integer.compare(o1.cost, o2.cost)));
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (dist[now.dest] < now.cost) {
                continue;
            }

            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > now.cost + next.cost) {
                    dist[next.dest] = now.cost + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }

        System.out.println(dist[end]);
    }
}
