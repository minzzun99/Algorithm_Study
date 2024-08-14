package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2636_치즈 {
    private static int N, M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int time, count;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    count++;
                }
            }
        }

        int cheeseCount = 0;
        while (count != 0) {
            cheeseCount = count;
            bfs();
            time++;
        }
        sb.append(time).append('\n');
        sb.append(cheeseCount);
        System.out.println(sb);
    }

    private static void bfs() {
        Deque<Node> deque = new ArrayDeque<>();
        visited = new boolean[N][M];
        visited[0][0] = true;
        deque.add(new Node(0, 0));

        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny]) {
                    visited[nx][ny] = true;

                    if (map[nx][ny] == 1) {
                        map[nx][ny] = 0;
                        count--;
                    } else {
                        deque.add(new Node(nx, ny));
                    }
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M;
    }
}
