package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj9205_맥주마시면서걸어가기 {
    private static ArrayList<Node> location;
    private static ArrayList<Integer>[] graph;

    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            location = new ArrayList<>();

            for (int i = 0; i < N + 2; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                location.add(new Node(a, b));
            }

            graph = new ArrayList[N + 2];
            for (int i = 0; i < N + 2; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < N + 2; i++) {
                for (int j = i + 1; j < N + 2; j++) {
                    if (calculateDist(location.get(i), location.get(j)) <= 1000) {
                        graph[i].add(j);
                        graph[j].add(i);
                    }
                }
            }

            if (bfs(N)) {
                sb.append("happy").append('\n');
            } else {
                sb.append("sad").append('\n');
            }
        }

        System.out.println(sb);
    }

    private static int calculateDist(Node n1, Node n2) {
        return Math.abs(n1.x - n2.x) + Math.abs(n1.y - n2.y);
    }

    private static boolean bfs(int N) {
        Deque<Integer> deque = new ArrayDeque<>();
        boolean[] visited = new boolean[N + 2];

        deque.add(0);
        visited[0] = true;

        while (!deque.isEmpty()) {
            int now = deque.poll();

            if (now == N + 1) {
                return true;
            }

            for (int next : graph[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    deque.add(next);
                }
            }
        }

        return false;
    }
}
