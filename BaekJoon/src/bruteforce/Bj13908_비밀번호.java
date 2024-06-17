package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj13908_비밀번호 {
    static int n, m, count;
    static int[] visited = new int[10];
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        backTracking(0);
        System.out.println(count);
    }

    public static void backTracking(int index) {
        if (index == n) {
            for (int i : list) {
                if (visited[i] == 0) return;
            }
            count++;
            return;
        }

        for (int i = 0; i < 10; i++) {
            visited[i]++;
            backTracking(index + 1);
            visited[i]--;
        }
    }
}
