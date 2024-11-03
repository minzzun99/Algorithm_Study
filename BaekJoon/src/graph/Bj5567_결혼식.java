package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Bj5567_결혼식 {
    private static int[] visited;
    private static List<Integer>[] adjList;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        adjList = new ArrayList[N + 1];
        visited = new int[N + 1];
        Arrays.fill(visited, -1);

        for (int i = 1; i < N + 1; i++) {
            adjList[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList[a].add(b);
            adjList[b].add(a);
        }

        bfs(1);

        System.out.println(count);
    }

    private static void bfs(int start) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(start);
        visited[start] = 0;
        while (!deque.isEmpty()) {
            int now = deque.poll();

            for (int next : adjList[now]) {
                if (visited[next] == -1) {
                    deque.add(next);
                    visited[next] = visited[now] + 1;
                }
            }
        }

        for (int i = 2; i < visited.length; i++) {
            if (visited[i] <= 2 && visited[i] > 0) {
                count++;
            }
        }
    }
}
