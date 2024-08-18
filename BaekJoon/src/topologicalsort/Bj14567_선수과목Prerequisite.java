package topologicalsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj14567_선수과목Prerequisite {
    private static int N, M;
    private static ArrayList<Integer>[] adjList;
    private static int[] subjects;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        subjects = new int[N + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            subjects[B]++;
            adjList[A].add(B);
        }
        System.out.println(sort());
    }

    private static String sort() {
        StringBuilder sb = new StringBuilder();
        int[] result = new int[N + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (subjects[i] == 0) {
                deque.add(i);
                result[i] = 1;
            }
        }

        while (!deque.isEmpty()) {
            int now = deque.poll();
            for (int next : adjList[now]) {
                subjects[next]--;
                if (subjects[next] == 0) {
                    deque.add(next);
                    result[next] = result[now] + 1;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append(' ');
        }

        return sb.toString();
    }
}
