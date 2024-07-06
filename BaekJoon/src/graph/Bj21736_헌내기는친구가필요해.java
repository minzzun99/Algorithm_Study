package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj21736_헌내기는친구가필요해 {
    private static int N, M;
    private static Node[][] map;
    private static boolean [][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static class Node {
        int x;
        int y;
        char c;

        public Node(int x, int y, char c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new Node[N][M];
        visited = new boolean[N][M];
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = new Node(i, j, str.charAt(j));
                if (map[i][j].c == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }

        int count = 0;
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(map[startX][startY]);
        visited[startX][startY] = true;

        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = now.x + dx[i];
                int nextY = now.y + dy[i];
                    if (isPossible(nextX, nextY) && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    deque.add(map[nextX][nextY]);
                    if (map[nextX][nextY].c == 'P') {
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
    }

    private static boolean isPossible(int nx, int ny) {
        if (0 <= nx && nx < N && 0 <= ny && ny < M && map[nx][ny].c != 'X') {
            return true;
        } else{
            return false;
        }
    }
}
