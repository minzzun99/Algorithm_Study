package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj25418_정수a를k로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if (A == K) {
            System.out.println(0);
        } else {
            System.out.println(bfs(A, K));
        }
    }

    private static int bfs(int A, int K) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] visited = new int[K + 1];
        Arrays.fill(visited, -1);
        visited[A] = 0;
        deque.add(A);
        while (!deque.isEmpty()) {
            if (visited[K] != -1) {
                break;
            }
            int now = deque.poll();
            int next1 = now + 1;
            int next2 = now * 2;
            if (next1 <= K && visited[next1] == -1) {
                deque.add(next1);
                visited[next1] = visited[now] + 1;
            }
            if (next2 <= K && visited[next2] == -1) {
                deque.add(next2);
                visited[next2] = visited[now] + 1;
            }
        }

        return visited[K];
    }
}
