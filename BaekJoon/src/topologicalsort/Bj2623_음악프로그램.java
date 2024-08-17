package topologicalsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2623_음악프로그램 {
    private static int N, M;
    private static ArrayList<Integer>[] adjList;
    private static int[] singer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        singer = new int[N + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int count = Integer.parseInt(st.nextToken());
            int prev = Integer.parseInt(st.nextToken());
            for (int i = 1; i < count; i++) {
                int num = Integer.parseInt(st.nextToken());
                singer[num]++;
                adjList[prev].add(num);
                prev = num;
            }
        }

        System.out.println(setSequence());
    }

    private static String setSequence() {
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (singer[i] == 0) {
                deque.add(i);
            }
        }

        while (!deque.isEmpty()) {
            int now = deque.poll();
            result.add(now);

            for (int next : adjList[now]) {
                singer[next]--;

                if (singer[next] == 0) {
                    deque.add(next);
                }
            }
        }

        if (result.size() != N) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i)).append('\n');
        }
        return sb.toString();
    }
}
