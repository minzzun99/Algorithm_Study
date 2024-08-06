package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj2644_촌수계산_DFS {
    private static int N;
    private static ArrayList<Integer>[] adjList;
    private static boolean[] visited;
    private static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adjList[x].add(y);
            adjList[y].add(x);
        }
        dfs(A, B, 0);
        System.out.println(result);
    }

    private static void dfs(int start, int end, int count) {
        if (start == end) {
            result = count;
            return;
        }

        visited[start] = true;
        for (int i = 0; i < adjList[start].size(); i++) {
            int next = adjList[start].get(i);
            if (!visited[next]) {
                dfs(next, end, count + 1);
            }
        }

    }
}
