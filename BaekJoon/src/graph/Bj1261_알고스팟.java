package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1261_알고스팟 {
    private static int N, M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static class Node {
        int x;
        int y;
        int cost;

        Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        int answer = dijkstra(new Node(0, 0, 0));
        System.out.println(answer);
    }

    private static int dijkstra(Node start) {
        PriorityQueue<Node> pq = new PriorityQueue<>(((o1, o2) -> o1.cost - o2.cost));
        visited = new boolean[N][M];
        visited[start.x][start.y] = true;
        pq.add(start);

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (now.x == N - 1 && now.y == M - 1) {
                return now.cost;
            }

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                // 벽 안부술 때
                if (isValid(nx, ny) && map[nx][ny] == 0) {
                    visited[nx][ny] = true;
                    pq.add(new Node(nx, ny, now.cost));
                }

                // 벽 부술 때
                if (isValid(nx, ny) && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    pq.add(new Node(nx, ny, now.cost + 1));
                }
            }
        }

        return 0;
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M && !visited[nx][ny];
    }
}
