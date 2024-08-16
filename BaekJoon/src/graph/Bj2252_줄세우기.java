package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2252_줄세우기 {
    private static ArrayList<Integer>[] adjList;
    private static int[] student;
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        student = new int[N + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            adjList[A].add(B);
            student[B]++;
        }

        setLine();
        System.out.println(sb);
    }

    private static void setLine() {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (student[i] == 0) {
                deque.add(i);
            }
        }

        while (!deque.isEmpty()) {
            int now = deque.poll();
            sb.append(now).append(' ');

            for (int next : adjList[now]) {
                student[next]--;
                if (student[next] == 0) {
                    deque.add(next);
                }
            }
        }
    }
}
