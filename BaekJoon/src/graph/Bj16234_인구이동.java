package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj16234_인구이동 {
    private static int N, L, R;
    private static boolean[][] visited;
    private static boolean flag;
    private static int[][] map;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static ArrayList<Node> changeList;

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
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int day = 0;
        while (true) {
            flag = false;
            visited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        int sum = bfs(new Node(i, j));
                        if (changeList.size() > 1) {
                            changeMap(sum);
                            flag = true;
                        }
                    }
                }
            }

            if (flag) {
                day++;
            } else {
                break;
            }
        }

        System.out.println(day);
    }

    private static int bfs(Node start) {
        Deque<Node> deque = new ArrayDeque<>();
        changeList = new ArrayList<>();
        deque.add(start);
        changeList.add(start);
        visited[start.x][start.y] = true;

        int sum = map[start.x][start.y];
        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny]) {
                    int value = Math.abs(map[now.x][now.y] - map[nx][ny]);
                    if (L <= value && value <= R) {
                        deque.add(new Node(nx, ny));
                        changeList.add(new Node(nx, ny));
                        sum += map[nx][ny];
                        visited[nx][ny] = true;
                    }
                }
            }
        }

        return sum;
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < N;
    }

    private static void changeMap(int sum) {
        int avg = sum / changeList.size();
        for (Node node : changeList) {
            map[node.x][node.y] = avg;
        }
    }
}
