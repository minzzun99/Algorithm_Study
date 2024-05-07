package ch11_graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem39 {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static class Node {
        int nx, ny;

        public Node(int nx, int ny) {
            this.nx = nx;
            this.ny = ny;
        }
    }

    private static char[][] map;
    private static int N, M;

    public int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();

        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = maps[i].toCharArray();
        }

        Node start = null;
        Node end = null;
        Node lever = null;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'S') {
                    start = new Node(j, i);
                } else if (map[i][j] == 'E') {
                    end = new Node(j, i);
                } else if (map[i][j] == 'L') {
                    lever = new Node(j, i);
                }
            }
        }
        // 시작점 -> 레버, 레버 -> 도착점까지 최단거리를 구하기
        int startLever = bfs(start, lever);
        int leverEnd = bfs(lever, end);

        if (startLever == -1 || leverEnd == -1) {
            return -1;
        } else {
            return startLever + leverEnd;
        }
    }

    private static int bfs(Node start, Node end) {
        int[][] dist = new int[N][M];
        Deque<Node> deque = new ArrayDeque<>();
        dist[start.ny][start.nx] = 1;
        deque.add(start);

        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = now.nx + dx[i];
                int nextY = now.ny + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) {
                    continue;
                }
                if (dist[nextY][nextX] > 0) {
                    continue;
                }
                if (map[nextY][nextX] == 'X') {
                    continue;
                }

                dist[nextY][nextX] = dist[now.ny][now.nx] + 1;
                deque.add(new Node(nextX, nextY));

                if (nextX == end.nx && nextY == end.ny) {
                    return dist[end.ny][end.nx] - 1;
                }
            }
        }
        return -1;
    }
}
