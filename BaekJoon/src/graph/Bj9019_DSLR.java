package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj9019_DSLR {
    private static StringBuilder[] arr;
    private static boolean[] visited;
    private static String[] dslr = {"D", "S", "L", "R"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            arr = new StringBuilder[10000];
            visited = new boolean[10000];
            bfs(N, M);
            sb.append(arr[M]).append('\n');
        }
        System.out.println(sb);
    }

    private static void bfs(int start, int end) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(start);
        visited[start] = true;
        arr[start] = new StringBuilder();

        while (!deque.isEmpty()) {
            int now = deque.poll();
            if (now == end) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                String command = dslr[i];
                int next = command(now, command);
                if (!visited[next]) {
                    deque.add(next);
                    visited[next] = true;
                    arr[next] = new StringBuilder(arr[now]).append(command);
                }
            }
        }
    }

    private static int command(int n, String c) {
        int next = 0;
        if (c.equals("D")) {
            next = commandD(n);
        } else if (c.equals("S")) {
            next = commandS(n);
        } else if (c.equals("L")) {
            next = commandL(n);
        } else {
            next = commandR(n);
        }
        return next;
    }

    private static int commandD(int n) {
        return 2 * n > 9999 ? (2 * n) % 10000 : 2 * n;
    }

    private static int commandS(int n) {
        return n == 0 ? 9999 : n - 1;
    }

    private static int commandL(int n) {
        int temp = n % 1000;
        return (temp * 10) + (n / 1000);
    }

    private static int commandR(int n) {
        int temp = n % 10;
        return (temp * 1000) + (n / 10);
    }
}
