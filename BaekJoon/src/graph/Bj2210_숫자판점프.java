package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj2210_숫자판점프 {
    private static int[][] graph;
    private static Set<Integer> set;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        graph = new int[5][5];
        set = new HashSet<>();

        StringTokenizer st;
        for (int i = 0; i < graph.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                dfs(i, j, 0, 0);
            }
        }

        System.out.println(set.size());
    }

    private static void dfs(int startX, int startY, int depth, int number) {
        if (depth == 6) {
            set.add(number);
            return;
        }

        number = number * 10 + graph[startX][startY];
        for (int i = 0; i < 4; i++) {
            int nx = startX + dx[i];
            int ny = startY + dy[i];

            if (isValid(nx, ny)) {
                dfs(nx, ny, depth + 1, number);
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < 5 && 0 <= ny && ny < 5;
    }
}
