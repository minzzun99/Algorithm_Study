package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj13460_구슬탈출2 {
    private static int N, M;
    private static char[][] board;
    private static boolean[][][][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};


    private static class State{
        Node red;
        Node blue;
        int count;

        State(Node red, Node blue, int count) {
            this.red = red;
            this.blue = blue;
            this.count = count;
        }
    }

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
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Node red = null;
        Node blue = null;

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j);
                if (board[i][j] == 'R') {
                    red = new Node(i, j);
                } else if (board[i][j] == 'B') {
                    blue = new Node(i, j);
                }
            }
        }

        int result = bfs(red, blue);
        if (result <= 10) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }

    private static int bfs(Node red, Node blue) {
        Deque<State> deque = new ArrayDeque<>();
        visited = new boolean[N][M][N][M];
        deque.add(new State(red, blue, 0));
        visited[red.x][red.y][blue.x][blue.y] = true;

        while (!deque.isEmpty()) {
            State now = deque.poll();

            if (now.count > 10) {
                return -1;
            }

            for (int i = 0; i < 4; i++) {
                Node nextRed = move(now.red, i);
                Node nextBlue = move(now.blue, i);

                // 파란 구슬이 구멍에 빠지면 그 시도는 실패
                if (board[nextBlue.x][nextBlue.y] == 'O') {
                    continue;
                }

                // 빨간 구슬이 구멍에 빠졌으면 성공
                if (board[nextRed.x][nextRed.y] == 'O') {
                    return now.count + 1;
                }

                // 두 구술의 위치가 겹칠 경우 이동 거리가 더 먼 구슬이 한칸 뒤로
                if (nextRed.x == nextBlue.x && nextRed.y == nextBlue.y) {
                    // 레드가 움직인 거리
                    int redCount = getDistance(now.red, nextRed);
                    // 블루가 움직인 거리
                    int blueCount = getDistance(now.blue, nextBlue);

                    if (redCount > blueCount) {
                        nextRed.x -= dx[i];
                        nextRed.y -= dy[i];
                    } else {
                        nextBlue.x -= dx[i];
                        nextBlue.y -= dy[i];
                    }
                }

                // 방문처리
                if (!visited[nextRed.x][nextRed.y][nextBlue.x][nextBlue.y]) {
                    visited[nextRed.x][nextRed.y][nextBlue.x][nextBlue.y] = true;
                    deque.add(new State(nextRed, nextBlue, now.count + 1));
                }
            }
        }

        return -1;
    }

    private static Node move(Node node, int x) {
        int nx = node.x;
        int ny = node.y;

        while (board[nx + dx[x]][ny + dy[x]] != '#' && board[nx][ny] != 'O') {
            nx += dx[x];
            ny += dy[x];
        }

        return new Node(nx, ny);
    }

    private static int getDistance(Node now, Node next) {
        return Math.abs(now.x - next.x) + Math.abs(now.y - next.y);
    }
}
