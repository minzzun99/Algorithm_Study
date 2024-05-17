package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj9372_상근이의여행 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());       // 국가의 수
            int M = Integer.parseInt(st.nextToken());       // 비행기 종류

            ArrayList<Integer>[] adjList = new ArrayList[N + 1];
            boolean[] visited = new boolean[N + 1];
            for (int i = 1; i < adjList.length; i++) {
                adjList[i] = new ArrayList<>();
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                adjList[a].add(b);
                adjList[b].add(a);
            }

            int count = 0;

            Deque<Integer> deque = new ArrayDeque<>();
            deque.add(1);
            visited[1] = true;
            while (!deque.isEmpty()) {
                int now = deque.poll();
                for (int next : adjList[now]) {
                    if (!visited[next]) {
                        deque.add(next);
                        visited[next] = true;
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
