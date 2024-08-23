package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj4485_녹색옷입은애가젤다지 {
    private static int[][] map;
    private static int[][] costArr;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int N;
    private static final int INF = Integer.MAX_VALUE;

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
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int idx = 1;
        while (true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            map = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            dijkstra(new Node(0, 0, map[0][0]));
            sb.append("Problem ").append(idx).append(": ").append(costArr[N - 1][N - 1]).append('\n');
            idx++;
        }
        System.out.println(sb);
    }

    private static void dijkstra(Node start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        pq.add(start);
        costArr = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(costArr[i], INF);
        }
        costArr[start.x][start.y] = start.cost;

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (now.x == N - 1 && now.y == N - 1) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (isValid(nx, ny)) {
                    if (costArr[nx][ny] > map[nx][ny] + now.cost) {
                        costArr[nx][ny] = map[nx][ny] + now.cost;
                        pq.add(new Node(nx, ny, costArr[nx][ny]));
                    }
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < N;
    }
}
