package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Bj5427_불 {
    private static final String FAIL = "IMPOSSIBLE\n";
    private static char[][] map;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int N, M;
    private static Node start;
    private static List<Node> fireList;

    private static class Node {
        int x;
        int y;
        int count;

        Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }

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
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            map = new char[M][N];
            fireList = new ArrayList<>();

            for (int i = 0; i < M; i++) {
                String line = br.readLine();
                for (int j = 0; j < N; j++) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == '@') {
                        start = new Node(i, j, 0);
                    } else if (map[i][j] == '*') {
                        fireList.add(new Node(i, j));
                    }
                }
            }

            int result = bfs();
            if (result == -1) {
                sb.append(FAIL);
                continue;
            }
            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }

    private static int bfs() {
        visited = new boolean[M][N];
        Deque<Node> deque = new ArrayDeque<>();
        visited[start.x][start.y] = true;
        deque.add(start);

        while (!deque.isEmpty()) {
            int size = deque.size();

            // 불 확산 시키고
            fireSpread();

            for (int s = 0; s < size; s++) {
                Node now = deque.poll();

                // 경계값이면?
                if (isExit(now.x, now.y)) {
                    return now.count + 1;
                }

                // 이동할 수 있으면 이동시키고
                for (int i = 0; i < 4; i++) {
                    int nx = now.x + dx[i];
                    int ny = now.y + dy[i];

                    if (isValid(nx, ny) && !visited[nx][ny] && map[nx][ny] == '.') {
                        visited[nx][ny] = true;
                        deque.add(new Node(nx, ny, now.count + 1));
                    }
                }
            }
        }

        return -1;
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < M && 0 <= ny && ny < N;
    }

    private static boolean isExit(int x, int y) {
        return x == 0 || y == 0 || x == M - 1 || y == N - 1;
    }

    private static void fireSpread() {
        List<Node> nextFireList = new ArrayList<>();
        for (Node fire : fireList) {
            int x = fire.x;
            int y = fire.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (!isValid(nx, ny)) {
                    continue;
                }

                if (map[nx][ny] == '#' || map[nx][ny] == '*') {
                    continue;
                }

                map[nx][ny] = '*';
                nextFireList.add(new Node(nx, ny));
            }
        }

        fireList = nextFireList;
    }
}
