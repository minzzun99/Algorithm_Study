package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj11123_양한마리양두마리 {
    private static char[][] map;
    private static boolean[][] visited;

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            map = new char[H][W];
            for (int i = 0; i < H; i++) {
                map[i] = br.readLine().toCharArray();
            }

            sb.append(bfs(H, W)).append('\n');
        }
        System.out.println(sb);
    }

    private static int bfs(int H, int W) {
        int count = 0;
        visited = new boolean[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (!visited[i][j] && map[i][j] == '#') {
                    Deque<Node> deque = new ArrayDeque<>();
                    deque.add(new Node(i, j));
                    visited[i][j] = true;

                    while (!deque.isEmpty()) {
                        Node now = deque.pollFirst();
                        for (int k = 0; k < 4; k++) {
                            int nx = now.x + dx[k];
                            int ny = now.y + dy[k];

                            if (isValid(nx, ny, H, W) && !visited[nx][ny] && map[nx][ny] == '#') {
                                visited[nx][ny] = true;
                                deque.add(new Node(nx, ny));
                            }
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isValid(int nx, int ny, int H, int W) {
        if (0 <= nx && nx < H && 0 <= ny && ny < W) {
            return true;
        }
        return false;
    }
}
