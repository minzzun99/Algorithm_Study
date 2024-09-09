package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1967_트리의지름 {
    private static class Node {
        int dest;
        int weight;

        Node(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    private static int N;
    private static ArrayList<Node>[] adjList;
    private static boolean[] visited;
//    private static boolean[] leaf;
    private static int max, distantNode;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
//        leaf = new boolean[N + 1];
//        Arrays.fill(leaf, true);
        if (N == 1) {
            System.out.println(0);  // 노드가 1개일 경우 지름은 0
            return;
        }

        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }


        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            adjList[start].add(new Node(end, weight));
            adjList[end].add(new Node(start, weight));
        }

        visited = new boolean[N + 1];
        dfs(1, 0);
        Arrays.fill(visited, false);
        max = 0;
        dfs(distantNode, 0);

        System.out.println(max);
    }

    private static void dfs(int start, int sum) {
        visited[start] = true;
        if (max < sum) {
            max = sum;
            distantNode = start;
        }

        for (Node next : adjList[start]) {
            if (!visited[next.dest]) {
                dfs(next.dest, sum + next.weight);
            }
        }
    }
}
