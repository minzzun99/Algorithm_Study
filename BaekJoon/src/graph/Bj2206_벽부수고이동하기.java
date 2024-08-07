package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2206_벽부수고이동하기 {
    private static class Node {
        int x;
        int y;
        boolean broken;
        Node (int x, int y, boolean broken) {
            this.x = x;
            this.y = y;
            this.broken = broken;
        }
    }

    private static int N, M;
    private static int[][] map;
    private static int[][][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new int[N][M][2];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        bfs();
        int result1 = visited[N - 1][M - 1][0];
        int result2 = visited[N - 1][M - 1][1];
        if (result1 == 0 && result2 == 0) {
            System.out.println(-1);
        } else if (result1 == 0) {
            System.out.println(result2);
        } else if (result2 == 0) {
            System.out.println(result1);
        } else {
            System.out.println(Math.min(result1, result2));
        }
    }

    private static void bfs() {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(0, 0, false));
        visited[0][0][0] = 1;
        visited[0][0][1] = 1;

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny)) {
                    if (map[nx][ny] == 0) {
                        // 다음 칸이 벽이 아닌 경우
                        if (!now.broken && visited[nx][ny][0] == 0) {
                            deque.add(new Node(nx, ny, false));
                            visited[nx][ny][0] = visited[now.x][now.y][0] + 1;
                        } else if (now.broken && visited[nx][ny][1] == 0) {
                            // 다음 칸이 벽이 아닌데 이미 벽을 부순 경우
                            deque.add(new Node(nx, ny, true));
                            visited[nx][ny][1] = visited[now.x][now.y][1] + 1;
                        }
                    } else if (map[nx][ny] == 1 && !now.broken) {
                        // 다음 칸이 벽이고 벽을 부순 적 없을 때
                        deque.add(new Node(nx, ny, true));
                        visited[nx][ny][1] = visited[now.x][now.y][0] + 1;
                    }
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M;
    }
}
