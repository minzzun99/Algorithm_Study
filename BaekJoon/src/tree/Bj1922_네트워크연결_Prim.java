package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1922_네트워크연결_Prim {
    private static ArrayList<Node>[] adjList;
    private static boolean[] visited;

    private static class Node {
        int next;
        int cost;

        Node(int next, int cost) {
            this.next = next;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            adjList[start].add(new Node(end, cost));
            adjList[end].add(new Node(start, cost));
        }

        System.out.println(countWeight(1));
    }

    private static int countWeight(int start) {
        int count = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.cost, o2.cost);
        });
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (visited[now.next]) {
                continue;
            }
            visited[now.next] = true;
            count += now.cost;

            for (Node next : adjList[now.next]) {
                if (!visited[next.next]) {
                    pq.add(next);
                }
            }
        }

        return count;
    }
}
