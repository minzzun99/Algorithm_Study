package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Bj1987_알파벳 {
    private static int R, C;
    private static char[][] map;
    private static boolean[][] visited;
    private static HashSet<Character> set;
    private static int max = 0;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];
        set = new HashSet<>();

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        set.add(map[0][0]);
        visited[0][0] = true;
        dfs(0, 0, 1);
        System.out.println(max);
    }

    private static void dfs(int x, int y, int count) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isValid(nx, ny) && !visited[nx][ny] && !set.contains(map[nx][ny])) {
                visited[nx][ny] = true;
                set.add(map[nx][ny]);
                dfs(nx, ny, count + 1);
                visited[nx][ny] = false;
                set.remove(map[nx][ny]);
            }
        }
        max = Math.max(count, max);
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < R && 0 <= ny && ny < C;
    }
}
