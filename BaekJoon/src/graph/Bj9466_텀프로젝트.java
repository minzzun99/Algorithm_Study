package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9466_텀프로젝트 {
    private static int N, count;
    private static int[] arr;
    private static boolean[] team, visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N + 1];
            team = new boolean[N + 1];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            visited = new boolean[N + 1];
            count = 0;
            for (int i = 1; i <= N; i++) {
                if (!team[i]) {
                    dfs(i);
                }
            }

            sb.append(N - count).append('\n');
        }

        System.out.println(sb);
    }

    private static void dfs(int now) {
        if(visited[now]) {
            return;
        }

        int next = arr[now];
        visited[now] = true;

        if (!visited[next]) {
            dfs(next);
        } else {
            if (!team[next]) {
                count++;
                int idx = next;
                while (idx != now) {
                    count++;
                    idx = arr[idx];
                }
            }
        }

        team[now] = true;
    }
}
