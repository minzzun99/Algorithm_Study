package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj7569_토마토 {
    private static int N, M, H;
    private static int max = Integer.MIN_VALUE;
    private static int[][][] box;
    private static ArrayList<Node> list = new ArrayList<>();
    private static int[] dx = {-1, 1, 0, 0, 0, 0};
    private static int[] dy = {0, 0, -1, 1, 0, 0};
    private static int[] dh = {0, 0, 0, 0, -1, 1};
    private static class Node {
        int x, y, h;

        public Node(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.h = h;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][N][M];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if (box[i][j][k] == 1) {
                        list.add(new Node(j, k, i));
                    }
                }
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        Deque<Node> deque = new ArrayDeque<>(list);

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 6; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                int nh = now.h + dh[i];
                if (isPossible(nx, ny, nh) && box[nh][nx][ny] == 0) {
                    deque.add(new Node(nx, ny, nh));
                    box[nh][nx][ny] = box[now.h][now.x][now.y] + 1;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) {
                        return -1;
                    }
                    max = Math.max(max, box[i][j][k]);
                }
            }
        }

        return max - 1;
    }

    private static boolean isPossible(int x, int y, int h) {
        if (0 <= x && x < N && 0 <= y && y < M && 0 <= h && h < H) {
            return true;
        } else {
            return false;
        }
    }
}
