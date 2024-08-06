package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj2644_촌수계산_BFS {
    private static int N;
    private static ArrayList<Integer>[] adjList;
    private static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[N + 1];
        visited = new int[N + 1];
        Arrays.fill(visited, -1);
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
        System.out.println(bfs(A, B));
    }

    private static int bfs(int A, int B) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(A);
        visited[A] = 0;
        while (!deque.isEmpty()) {
            int now = deque.poll();
            if (now == B) {
                break;
            }
            for (int i = 0; i < adjList[now].size(); i++) {
                int next = adjList[now].get(i);
                if (visited[next] == -1) {
                    deque.add(next);
                    visited[next] = visited[now] + 1;
                }
            }
        }
        return visited[B];
    }
}
