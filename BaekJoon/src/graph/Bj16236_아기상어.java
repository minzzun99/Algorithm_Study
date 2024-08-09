package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj16236_아기상어 {
    private static int N, sharkX, sharkY, minX, minY, minDist;
    private static int sharkSize = 2;
    private static int eat = 0;
    private static int move = 0;
    private static int [][] dist;
    private static int[][] map;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

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
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) {
                    sharkX = i;
                    sharkY = j;
                    map[i][j] = 0;
                }
            }
        }

        while (true) {
            dist = new int[N][N];
            minX = Integer.MAX_VALUE;
            minY = Integer.MAX_VALUE;
            minDist = Integer.MAX_VALUE;

            bfs(new Node(sharkX, sharkY));
            if (minX != Integer.MAX_VALUE && minY != Integer.MAX_VALUE) {
                eat++;
                map[minX][minY] = 0;
                sharkX = minX;
                sharkY = minY;
                move += dist[minX][minY];

                if (eat == sharkSize) {
                    sharkSize++;
                    eat = 0;
                }
            } else {
                break;
            }
        }

        System.out.println(move);
    }

    private static void bfs(Node start) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(start);

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && canMove(nx, ny) && dist[nx][ny] == 0) {
                    dist[nx][ny] = dist[now.x][now.y] + 1;

                    if (canEat(nx, ny)) {
                        changePosition(nx, ny);
                    }
                    deque.add(new Node(nx, ny));
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < N;
    }

    private static boolean canMove(int nx, int ny) {
        return map[nx][ny] <= sharkSize;
    }

    private static boolean canEat(int nx, int ny) {
        return map[nx][ny] != 0 && map[nx][ny] < sharkSize;
    }

    private static void changePosition(int nx, int ny) {
        if (minDist > dist[nx][ny]) {
            minDist = dist[nx][ny];
            minX = nx;
            minY = ny;
        } else if (minDist == dist[nx][ny]) {
            if (minX == nx) {
                if (minY > ny) {
                    minY = ny;
                }
            } else if (minX > nx) {
                minX = nx;
                minY = ny;
            }
        }
    }
}
