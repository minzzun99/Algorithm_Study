package topologicalsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1516_게임개발 {
    private static int N;
    private static ArrayList<Integer>[] adjList;
    private static int[] times;
    private static int[] order;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        times = new int[N + 1];
        order = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            times[i] = Integer.parseInt(st.nextToken());
            while (true) {
                int x = Integer.parseInt(st.nextToken());
                if (x == -1) {
                    break;
                }
                adjList[x].add(i);
                order[i]++;
            }
        }

        System.out.println(sort());
    }

    private static String sort() {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            if (order[i] == 0) {
                deque.add(i);
            }
        }

        while (!deque.isEmpty()) {
            int now = deque.poll();
            for (int next : adjList[now]) {
                result[next] = Math.max(result[next], result[now] + times[now]);
                order[next]--;
                if (order[next] == 0) {
                    deque.add(next);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            result[i] += times[i];
            sb.append(result[i]).append('\n');
        }

        return sb.toString();
    }
}
