package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj11060_점프점프 {
    private static int[] arr;
    private static boolean[] visited;
    private static int N;

    private static class Node {
        int index;
        int count;

        Node(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = bfs();
        System.out.println(result);
    }

    private static int bfs() {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(1, 0));
        visited = new boolean[N + 1];
        visited[1] = true;

        int result = -1;
        while (!deque.isEmpty()) {
            Node now = deque.poll();
            if (now.index == N) {
                result = now.count;
                break;
            }

            for (int i = 0; i <= arr[now.index]; i++) {
                if (isValid(now.index + i) && !visited[now.index + i]) {
                    deque.add(new Node(now.index + i, now.count + 1));
                    visited[now.index + i] = true;
                }
            }
        }

        return result;
    }

    private static boolean isValid(int x) {
        return 1 <= x && x <= N;
    }
}
