package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj5014_스타트링크 {
    private static int[] building;
    private static int[] df;
    private static int F, S, G, U, D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        F = Integer.parseInt(st.nextToken());       // 건물의 층 수
        S = Integer.parseInt(st.nextToken());       // 현재 위치
        G = Integer.parseInt(st.nextToken());       // StartLink
        U = Integer.parseInt(st.nextToken());       // 위로
        D = Integer.parseInt(st.nextToken());       // 아래로

        building = new int[F + 1];
        Arrays.fill(building, -1);
        df = new int[]{U, -D};

        bfs();
        int count = building[G];
        if (count == -1) {
            System.out.println("use the stairs");
        } else {
            System.out.println(count);
        }
    }

    private static void bfs() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(S);
        building[S] = 0;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            for (int i = 0; i < 2; i++) {
                int next = now + df[i];
                if (isValid(next)) {
                    deque.add(next);
                    building[next] = building[now] + 1;
                }
            }
        }
    }

    private static boolean isValid(int next) {
        return 1 <= next && next <= F && building[next] == -1;
    }
}
