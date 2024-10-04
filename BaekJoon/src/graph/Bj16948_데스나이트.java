package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj16948_데스나이트 {
    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int N;
    private static int[][] visited;
    private static Node start;
    private static Node end;

    private static int[] dx = {-2, -2, 0, 0, 2, 2};
    private static int[] dy = {-1, 1, -2, 2, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        start = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        end = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        bfs();
        System.out.println(visited[end.x][end.y]);
    }

    private static void bfs() {
        Deque<Node> deque = new ArrayDeque<>();
        visited = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], -1);
        }

        deque.add(start);
        visited[start.x][start.y] = 0;

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            if (now.x == end.x && now.y == end.y) {
                break;
            }

            for (int i = 0; i < 6; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && visited[nx][ny] == -1) {
                    deque.add(new Node(nx, ny));
                    visited[nx][ny] = visited[now.x][now.y] + 1;
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < N;
    }
}
