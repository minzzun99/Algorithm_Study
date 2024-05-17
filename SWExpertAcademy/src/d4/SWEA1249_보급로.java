package d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SWEA1249_보급로 {
    private static int N, min;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int[][] arr;
    private static boolean[][] visited;

    private static class Node {
        int x, y, value;

        public Node(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int c = 1; c <= T; c++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N][N];
            visited = new boolean[N][N];
            min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }
            bfs();
            sb.append("#").append(c).append(' ').append(min).append('\n');
        }
        System.out.println(sb);
    }

    private static void bfs() {
        PriorityQueue<Node> queue = new PriorityQueue<>((Node o1, Node o2) -> {
            return Integer.compare(o1.value, o2.value);
        });
        queue.add(new Node(0, 0, arr[0][0]));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            if (now.x == N - 1 && now.y == N - 1) {
                min = Math.min(min, now.value);
            }

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (0 <= nx && nx < arr.length && 0 <= ny && ny < arr.length) {
                    if (!visited[nx][ny]) {
                        int totalValue = now.value + arr[nx][ny];
                        queue.add(new Node(nx, ny, totalValue));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}
