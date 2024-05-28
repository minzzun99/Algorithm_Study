package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj7562_나이트의이동 {
    private static int[][] map;
    private static boolean[][] visited;
    private static int N;
    private static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
    public static class Node {
        int x;
        int y;
        int value;

        public Node(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            int destX = Integer.parseInt(st.nextToken());
            int destY = Integer.parseInt(st.nextToken());
            map = new int[N][N];
            visited = new boolean[N][N];

            Deque<Node> deque = new ArrayDeque<>();
            deque.add(new Node(startX, startY, 0));
            visited[startX][startY] = true;
            while (!deque.isEmpty()) {
                Node now = deque.poll();
                map[now.x][now.y] = now.value;
                for (int i = 0; i < 8; i++) {
                    int nx = now.x + dx[i];
                    int ny = now.y + dy[i];
                    if (isPossible(nx, ny) && !visited[nx][ny]) {
                        deque.add(new Node(nx, ny, now.value + 1));
                        visited[nx][ny] = true;
                    }
                }
            }
            sb.append(map[destX][destY]).append('\n');
        }
        System.out.println(sb);
    }

    private static boolean isPossible(int nx, int ny) {
        if (0 <= nx && nx < N && 0 <= ny && ny < N) {
            return true;
        } else {
            return false;
        }
    }
}
