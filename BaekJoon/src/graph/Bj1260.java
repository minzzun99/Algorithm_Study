package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1260 {
    private static ArrayList<Integer>[] adjList;
    private static boolean[] visitedDFS;
    private static ArrayList<Integer> answerDFS;
    private static ArrayList<Integer> answerBFS;
    private static boolean[] visitedBFS;
    private static void dfs(int start) {
        visitedDFS[start] = true;
        answerDFS.add(start);
        for (int x : adjList[start]) {
            if (!visitedDFS[x]) {
                dfs(x);
            }
        }
    }

    private static void bfs(int start) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(start);
        visitedBFS[start] = true;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            answerBFS.add(now);
            for (int i : adjList[now]) {
                if (!visitedBFS[i]) {
                    visitedBFS[i] = true;
                    deque.add(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());       // 노드 개수
        int m = Integer.parseInt(st.nextToken());       // 간선의 개수
        int v = Integer.parseInt(st.nextToken());       // start 노드

        adjList = new ArrayList[n + 1];
        visitedBFS = new boolean[n + 1];
        visitedDFS = new boolean[n + 1];
        answerBFS = new ArrayList<>();
        answerDFS = new ArrayList<>();

        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adjList[x].add(y);
            adjList[y].add(x);
        }

        for (int i = 1; i < adjList.length; i++) {
            Collections.sort(adjList[i]);
        }

        dfs(v);
        bfs(v);
        answerDFS.stream().mapToInt(Integer::intValue).forEach( value -> {System.out.print(value + " ");});
        System.out.println();
        answerBFS.stream().mapToInt(Integer::intValue).forEach( value -> {System.out.print(value + " ");});
    }
}
