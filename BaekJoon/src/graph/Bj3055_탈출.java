package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj3055_탈출 {
    private static int R, C;
    private static char[][] map;
    private static int[][] visited;

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static Node start, end;

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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];

        Deque<Node> wq = new ArrayDeque<>();

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);

                if (map[i][j] == 'S') {
                    start = new Node(i, j);
                } else if (map[i][j] == 'D') {
                    end = new Node(i, j);
                } else if (map[i][j] == '*') {
                    wq.add(new Node(i, j));
                }
            }
        }

        bfs(wq);

        if (visited[end.x][end.y] == -1) {
            System.out.println("KAKTUS");
        } else {
            System.out.println(visited[end.x][end.y]);
        }
    }

    private static void bfs(Deque<Node> wq) {
        Deque<Node> sq = new ArrayDeque<>();
        sq.add(start);
        visited = new int[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(visited[i], -1);
        }
        visited[start.x][start.y] = 0;

        while (!sq.isEmpty()) {
            int wqLength = wq.size();

            for (int i = 0; i < wqLength; i++) {
                Node nowWater = wq.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = nowWater.x + dx[j];
                    int ny = nowWater.y + dy[j];

                    if (isValid(nx, ny) && map[nx][ny] == '.') {
                        map[nx][ny] = '*';
                        wq.add(new Node(nx, ny));
                    }
                }
            }

            // 고슴도치 이동
            int sqLength = sq.size();
            for (int i = 0; i < sqLength; i++) {
                Node nowLoc = sq.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = nowLoc.x + dx[j];
                    int ny = nowLoc.y + dy[j];

                    if (isValid(nx, ny) && visited[nx][ny] == -1) {
                        if (map[nx][ny] == 'D') {
                            visited[nx][ny] = visited[nowLoc.x][nowLoc.y] + 1;
                            return;
                        }
                        if (map[nx][ny] == '.') {
                            visited[nx][ny] = visited[nowLoc.x][nowLoc.y] + 1;
                            sq.add(new Node(nx, ny));
                        }
                    }
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < R && 0 <= ny && ny < C;
    }
}
