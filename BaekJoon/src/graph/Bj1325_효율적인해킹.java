package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1325_효율적인해킹 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] adjList = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            adjList[B].add(A);
        }

        int[] counts = new int[N + 1];
        int maxHackCount = 0;

        for (int i = 1; i <= N; i++) {
            int count = bfs(i, adjList, N);
            counts[i] = count;
            maxHackCount = Math.max(maxHackCount, count);
        }

        for (int i = 1; i <= N; i++) {
            if (counts[i] == maxHackCount) {
                sb.append(i).append(' ');
            }
        }

        System.out.println(sb.toString().trim());
    }

    private static int bfs(int start, ArrayList<Integer>[] adjList, int N) {
        boolean[] visited = new boolean[N + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;

            for (int next : adjList[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

        return count;
    }
}
