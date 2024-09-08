package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1865_웜홀 {
    private static class Node {
        int dest;
        int cost;

        Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    private static int N, M, W;
    private static int[] dist;
    private static ArrayList<Node>[] adjList;
    private static final int INF = 999_999_999;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            dist = new int[N + 1];
            adjList = new ArrayList[N + 1];
            for (int i = 1; i <= N; i++) {
                adjList[i] = new ArrayList<>();
            }

            while (M-- > 0) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                adjList[start].add(new Node(end, cost));
                adjList[end].add(new Node(start, cost));
            }

            while (W-- > 0) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                adjList[start].add(new Node(end, -cost));
            }

            boolean flag = false;
            for (int i = 1; i <= N; i++) {
                if (checkMinusCycle(i)) {
                    flag = true;
                    sb.append("YES").append('\n');
                    break;
                }
            }

            if (!flag) {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }

    private static boolean checkMinusCycle(int start) {
        Arrays.fill(dist, INF);
        dist[start] = 0;

        boolean check = false;
        for (int i = 1; i < N; i++) {
            check = false;
            for (int j = 1; j <= N; j++) {
                for (Node node : adjList[j]) {
                    if (dist[j] != INF && dist[node.dest] > dist[j] + node.cost) {
                        dist[node.dest] = dist[j] + node.cost;
                        check = true;
                    }
                }
            }

            if (!check) {
                break;
            }
        }

        // (정점의 개수 - 1)번까지 계속 업데이트가 발생했을 경우
        // (정점의 개수)번도 업데이트 발생하면 음수 사이클이 일어난 것을 의미함.
        if (check) {
            for (int i = 1; i <= N; i++) {
                for (Node node : adjList[i]) {
                    if (dist[i] != INF && dist[node.dest] > dist[i] + node.cost) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
