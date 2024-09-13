package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1707_이분그래프 {
    private static int V, E;
    private static ArrayList<Integer>[] adjList;
    private static int[] visited;
    private static final int RED = -1;
    private static final int BLUE = 1;
    private static boolean answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            answer = true;
            st = new StringTokenizer(br.readLine(), " ");
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            adjList = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                adjList[i] = new ArrayList<>();
            }
            visited = new int[V + 1];

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                adjList[a].add(b);
                adjList[b].add(a);
            }

            for (int i = 1; i <= V; i++) {
                if (!answer) {
                    break;
                }

                if (visited[i] == 0) {
                    bfs(i);
                }
            }

            if (answer) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }


    private static void bfs(int start) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(start);
        visited[start] = RED;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            int nowColor = visited[now];
            for (int next : adjList[now]) {
                if (visited[next] == 0) {
                    visited[next] = -nowColor;
                    deque.add(next);
                } else if (visited[next] == nowColor) {
                    answer = false;
                    break;
                }
            }
        }
    }
}
