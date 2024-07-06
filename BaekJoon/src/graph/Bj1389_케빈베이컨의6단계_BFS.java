package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1389_케빈베이컨의6단계_BFS {
    private static int N, M;
    private static ArrayList<Integer>[] adjList;
    private static int[] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dist = new int[N + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            adjList[A].add(B);
            adjList[B].add(A);
        }

        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 1; i < N + 1; i++) {
            int count = dfs(i);
            if (min > count) {
                min = count;
                idx = i;
            }
        }
        System.out.println(idx);
    }

    private static int dfs(int start) {
        Arrays.fill(dist, -1);
        int count = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(start);
        dist[start] = 0;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            for (int next : adjList[now]) {
                if (dist[next] != -1) {
                    continue;
                }
                dist[next] = dist[now] + 1;
                count += dist[next];
                deque.add(next);
            }
        }
        return count;
    }
}
