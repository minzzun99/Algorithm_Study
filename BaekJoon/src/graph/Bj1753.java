package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1753 {
    public static class Node {
        int dest;       // 정점이 가는 목적지
        int cost;       // 가중치

        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.parseInt(st.nextToken());       // 정점의 개수
        int e = Integer.parseInt(st.nextToken());       // 간선의 개수
        int k = Integer.parseInt(br.readLine());        // 시작 노드

        // 인접 리스트 생성
        ArrayList<Node>[] adjList = new ArrayList[v + 1];

        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        // 간선 입력받고 adjList에 저장
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            adjList[n].add(new Node(d, w));
        }

        int[] dist = new int[v + 1];
        for (int i = 1; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        // 시작 위치의 거리 0으로 초기화
        dist[k] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
        pq.add(new Node(k, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (dist[now.dest] < now.cost) {
                continue;
            }
            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > next.cost + now.cost) {
                    dist[next.dest] = next.cost + now.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }

        for (int i = 1; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}
