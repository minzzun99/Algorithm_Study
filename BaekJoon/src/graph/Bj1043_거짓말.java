package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1043_거짓말 {
    private static int N, M;
    private static ArrayList<Integer>[] partyList;      // 파티에 참여한 사람을 저장
    private static ArrayList<Integer>[] adjList;        //사람들이 참여한 파티 저장
    private static boolean[] knowsTruth;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        knowsTruth = new boolean[N + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        partyList = new ArrayList[M];
        for (int i = 0; i < M; i++) {
            partyList[i] = new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        for (int i = 0; i < K; i++) {
            knowsTruth[Integer.parseInt(st.nextToken())] = true;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());

            for (int j = 0; j < num; j++) {
                int person = Integer.parseInt(st.nextToken());
                partyList[i].add(person);
                adjList[person].add(i);
            }
        }

        System.out.println(bfs());
    }


    private static int bfs() {
        Deque<Integer> deque = new ArrayDeque<>();
        int count = 0;
        boolean[] visited = new boolean[M];

        for (int i = 1; i <= N; i++) {
            if (knowsTruth[i]) {
                for (int j = 0; j < adjList[i].size(); j++) {
                    if (!visited[adjList[i].get(j)]) {
                        deque.add(adjList[i].get(j));
                        visited[adjList[i].get(j)] = true;
                    }
                }
            }
        }

        while (!deque.isEmpty()) {
            int partyNum = deque.poll();

            for (int x : partyList[partyNum]) {
                for (int y : adjList[x]) {
                    if (!visited[y]) {
                        deque.add(y);
                        visited[y] = true;
                    }
                }
            }
        }

        for (int i = 0; i < M; i++) {
            if (!visited[i]) {
                count++;
            }
        }

        return count;
    }
}
