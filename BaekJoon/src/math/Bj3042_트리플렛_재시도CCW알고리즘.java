package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj3042_트리플렛_재시도CCW알고리즘 {
    public static int ccw(int[] p1, int[] p2, int[] p3) {
        int x1 = p1[0];
        int y1 = p1[1];
        int x2 = p2[0];
        int y2 = p2[1];
        int x3 = p3[0];
        int y3 = p3[1];
        return (x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3);
    }

    public static List<int[][]> combinations(List<int[]> ans) {
        List<int[][]> result = new ArrayList<>();
        int n = ans.size();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    result.add(new int[][]{ans.get(i), ans.get(j), ans.get(k)});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] maps = new char[N][N];
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                maps[i][j] = line.charAt(j);
                if (maps[i][j] != '.') {
                    ans.add(new int[]{i, j});
                }
            }
        }

        int cnt = 0;
        List<int[][]> comb = combinations(ans);
        for (int[][] value : comb) {
            if (ccw(value[0], value[1], value[2]) == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
