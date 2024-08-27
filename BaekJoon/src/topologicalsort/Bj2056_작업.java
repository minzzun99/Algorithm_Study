package topologicalsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2056_작업 {
    private static int N;
    private static ArrayList<Integer>[] adjList;
    private static int[] times;
    private static int[] orders;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        adjList = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }
        times = new int[N + 1];
        orders = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int time = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                adjList[0].add(i);
            } else {
                while (num-- > 0) {
                    int next = Integer.parseInt(st.nextToken());
                    adjList[next].add(i);
                    orders[i]++;
                }
            }
            times[i] = time;
        }
        int result = minTime();

        System.out.println(result);
    }

    private static int minTime() {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            if (orders[i] == 0) {
                result[i] = times[i];
                deque.add(i);
            }
        }

        while (!deque.isEmpty()) {
            int now = deque.poll();

            for (int next : adjList[now]) {
                orders[next]--;
                result[next] =  Math.max(result[next], result[now] + times[next]);

                if (orders[next] == 0) {
                    deque.add(next);
                }
            }
        }

        int maxTime = 0;
        for (int i = 1; i <= N; i++) {
            maxTime = Math.max(maxTime, result[i]);
        }

        return maxTime;
    }
}
