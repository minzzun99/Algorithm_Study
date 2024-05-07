package ch11_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Problem36 {
    public static class Node {
        int dest, cost;     // 노드번호와 거리

        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static int[] solution(int[][] graph, int start, int n) {
        ArrayList<Node>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }

        //graph 정보를 인접리스트로 저장
        for (int[] edge : graph) {
            adjList[edge[0]].add(new Node(edge[1], edge[2]));
        }

        // 거리 값 저장하는 배열
        int[] dist = new int[n];
        // 모든 노드의 거리값을 무한대로 초기화 INF
        Arrays.fill(dist, Integer.MAX_VALUE);

        // 시작노드의 거리 값 0으로 초기화
        dist[start] = 0;

        // 우선순위 큐를 생성하고 시작노드를 삽입
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            // 현재 가장 거리가 짧은 노드를 가져옴   우선순위 큐를 선언할때 비용이 작은 것 부터로 우선 순위를 줌
            Node now = pq.poll();
            // 만약 현재 노드의 거리 값이 큐에서 가져온 거리 값보다 크면, 해당 노드는 이미 방문한 것이므로 무시
            if (dist[now.dest] < now.cost) {
                continue;
            }
            // 현재 노드와 인접한 노드들의 거리 값을 계산하여 업데이트
            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > now.cost + next.cost) {
                    dist[next.dest] = now.cost + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int[][] graph = {{0, 1, 9}, {0, 2, 3}, {1, 0, 5}, {2, 1, 1}};
        int start = 0;
        int n = 3;
        Arrays.stream(solution(graph, start, n)).forEach(System.out::println);
    }
}
