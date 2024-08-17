package topologicalsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1766_문제집 {
    private static int N, M;
    private static ArrayList<Integer>[] adjList;
    private static int[] problem;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[N + 1];
        problem = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            adjList[A].add(B);
            problem[B]++;
        }

        System.out.println(topologicalSort());
    }

    private static String topologicalSort() {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1, o2));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (problem[i] == 0) {
                pq.add(i);
            }
        }

        while (!pq.isEmpty()) {
            int now = pq.poll();
            sb.append(now).append(' ');

            for (int next : adjList[now]) {
                problem[next]--;
                if (problem[next] == 0) {
                    pq.add(next);
                }
            }
        }

        return sb.toString();
    }
}
