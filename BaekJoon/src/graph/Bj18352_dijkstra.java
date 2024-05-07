package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj18352_dijkstra {
    public static class Node {
        int dest;
        int cost;
        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());       // 최단 거리가 k 인것
        int x = Integer.parseInt(st.nextToken());       // 출발 도시

        ArrayList<Node>[] arrayList = new ArrayList[n + 1];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arrayList[start].add(new Node(end, 1));
        }

        int[] dist = new int[n + 1];
        for (int i = 1; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[x] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(((o1, o2) -> Integer.compare(o1.cost, o2.cost)));
        pq.add(new Node(x, dist[x]));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (dist[now.dest] < now.cost) {        // 이미 방문함
                continue;
            }

            for (Node next : arrayList[now.dest]) {
                if (dist[next.dest] > next.cost + now.cost) {
                    dist[next.dest] = next.cost + now.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }

        int count = 0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] == k) {
                sb.append(i).append('\n');
            } else {
                count++;
            }
        }

        if (count == n) {
            System.out.println(-1);
        } else {
            System.out.println(sb);
        }
    }
}
