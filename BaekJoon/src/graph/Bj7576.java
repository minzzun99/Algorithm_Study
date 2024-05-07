package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj7576 {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int[][] box;
    private static int n, m;
    private static Queue<Node> queue = new ArrayDeque<>();

    public static class Node {
        int x, y, day;
        public Node(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    private static void bfs() {
        int day = 0;

        while (!queue.isEmpty()) {
            Node now = queue.poll();
            day = now.day;

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        queue.add(new Node(nx, ny, day + 1));
                    }
                }
            }
        }
        if (checkBox()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean checkBox() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = Integer.parseInt(st.nextToken());       // 가로
        n = Integer.parseInt(st.nextToken());       // 세로
        // 토마토 박스
        box = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    queue.add(new Node(i, j, 0));
                }
            }
        }

        bfs();
    }
}
