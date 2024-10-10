package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Bj2638_치즈 {
    private static int N, M;
    private static List<Node> cheeseList = new ArrayList<>();
    private static int[][] cheeseMap;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int time;
    private static int cheeseCount;

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
        cheeseMap = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                cheeseMap[i][j] = Integer.parseInt(st.nextToken());

                if (cheeseMap[i][j] == 1) {
                    cheeseList.add(new Node(i, j));
                    cheeseCount++;
                }
            }
        }

        while(cheeseCount != 0) {
            time++;
            visited = new boolean[N][M];
            bfs();
            melting();
        }

        System.out.println(time);
    }

    private static void bfs() {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(0, 0));
        visited[0][0] = true;
        cheeseMap[0][0] = 2;

        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny] && cheeseMap[nx][ny] != 1) {
                    cheeseMap[nx][ny] = 2;
                    visited[nx][ny] = true;
                    deque.add(new Node(nx, ny));
                }
            }
        }
    }

    private static void melting() {
        for (int i = cheeseList.size() - 1; i >= 0; i--) {
            int count = 0;
            int x = cheeseList.get(i).x;
            int y = cheeseList.get(i).y;

            for(int j = 0; j < 4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];

                if(isValid(nx, ny) && cheeseMap[nx][ny] == 2) {
                    count++;
                }
            }

            if (count >= 2) {
                cheeseMap[x][y] = 0;
                cheeseCount--;
                cheeseList.remove(i);
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M;
    }
}
