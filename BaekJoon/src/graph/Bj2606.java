package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj2606 {
    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    static int count;
    private static void dfs(int node) {
        visited[node] = true;
        for (int next : adjList[node]) {
            if (!visited[next]) {
                count++;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        adjList = new ArrayList[computer + 1];
        visited = new boolean[computer + 1];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adjList[start].add(end);
            adjList[end].add(start);
        }
        count = 0;
        dfs(1);
        System.out.println(count);
    }
}
