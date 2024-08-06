package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj13549_숨바꼭질3 {
    private static class Node {
        int x;
        int second;

        Node(int x, int second) {
            this.x = x;
            this.second = second;
        }
    }

    private static boolean[] visited;
    private static int min = Integer.MAX_VALUE;
    private static int max = 100000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        visited = new boolean[max + 1];
        bfs(N, K);
        System.out.println(min);
    }

    private static void bfs(int start, int end) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(start, 0));

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            visited[now.x] = true;
            if (now.x == end) {
                min = Math.min(min, now.second);
            }

            if (now.x * 2 <= max && !visited[now.x * 2]) {
                deque.add(new Node((now.x * 2), now.second));
            }
            if (now.x + 1 <= max && !visited[now.x + 1]) {
                deque.add(new Node((now.x + 1), now.second + 1));
            }
            if (now.x - 1 >= 0 && !visited[now.x - 1]) {
                deque.add(new Node((now.x - 1), now.second + 1));
            }
        }
    }
}
