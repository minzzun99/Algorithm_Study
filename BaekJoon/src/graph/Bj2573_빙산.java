package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2573_빙산 {
    private static int N, M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[][] meltCount;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static class Iceberg {
        int x;
        int y;

        Iceberg(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        while (true) {
            boolean allMelt = true;
            meltCount = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] >= 1) {
                        setMeltIceberg(new Iceberg(i, j));
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] > 0) {
                        map[i][j] -= meltCount[i][j];
                        if (map[i][j] < 0) {
                            map[i][j] = 0;
                        }
                        allMelt = false;
                    }
                }
            }

            if (allMelt) {
                System.out.println(0);
                return;
            }

            visited = new boolean[N][M];
            int search = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] >= 1 && !visited[i][j]) {
                        bfs(new Iceberg(i, j));
                        search++;
                    }
                }
            }

            count++;

            if (search > 1) {
                break;
            }
        }

        System.out.println(count);
    }

    private static void setMeltIceberg(Iceberg iceberg) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nx = iceberg.x + dx[i];
            int ny = iceberg.y + dy[i];

            if (isValid(nx, ny) && map[nx][ny] == 0) {
                count++;
            }
        }
        meltCount[iceberg.x][iceberg.y] = count;
    }

    private static void bfs(Iceberg start) {
        Deque<Iceberg> deque = new ArrayDeque<>();
        visited[start.x][start.y] = true;
        deque.add(start);

        while (!deque.isEmpty()) {
            Iceberg now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny] && map[nx][ny] >= 1) {
                    visited[nx][ny] = true;
                    deque.add(new Iceberg(nx, ny));
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M;
    }
}
