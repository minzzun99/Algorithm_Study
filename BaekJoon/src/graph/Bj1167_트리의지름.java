package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1167_트리의지름 {
    private static int V;
    private static final int END_NUM = -1;
    private static ArrayList<Node>[] adjList;
    private static boolean[] visited;
    private static int max, distantNode;

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
        StringTokenizer st;

        V = Integer.parseInt(br.readLine());
        adjList = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            adjList[i] = new ArrayList<>();
        }

        for(int i = 0; i < V; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int node = Integer.parseInt(st.nextToken());
            while (true) {
                int dest = Integer.parseInt(st.nextToken());
                if (dest == END_NUM) {
                    break;
                }
                int cost = Integer.parseInt(st.nextToken());
                adjList[node].add(new Node(dest, cost));
                adjList[dest].add(new Node(node, cost));
            }
        }

        visited = new boolean[V + 1];
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
                dfs(next.dest, sum + next.cost);
            }
        }
    }
}
