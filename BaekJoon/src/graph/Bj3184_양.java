package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj3184_양 {
    private static int R, C;
    private static char[][] map;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int countO, countV;

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
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j] && (map[i][j] == 'v' || map[i][j] == 'o')) {
                    bfs(new Node(i, j));
                }
            }
        }
        sb.append(countO).append(' ').append(countV);
        System.out.println(sb);
    }

    private static void bfs(Node node) {
        Deque<Node> deque = new ArrayDeque<>();
        int wolf = 0;
        int sheep = 0;
        visited[node.x][node.y] = true;
        deque.add(node);

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            if (map[now.x][now.y] == 'v') {
                wolf++;
            } else if (map[now.x][now.y] == 'o'){
                sheep++;
            }

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny] && map[nx][ny] != '#') {
                    deque.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }

        if (sheep > wolf) {
            countO += sheep;
        } else {
            countV += wolf;
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < R && 0 <= ny && ny < C;
    }
}
