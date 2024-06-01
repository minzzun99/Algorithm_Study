package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj24479_dfs1 {
    //인접한 리스트를 저장할 ArrayList
    static ArrayList<Integer>[] adjList;
    //방문 순서 저장할 배열
    static int[] visited;
    // 몇번쨰 방문인지
    static int cnt;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());       // 노드의 개수
        int M = Integer.parseInt(st.nextToken());       // 간선의 개수
        int R = Integer.parseInt(st.nextToken());       // 시작 노드

        adjList = new ArrayList[N + 1];
        visited = new int[N + 1];
        // 인접리스트 초기화
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        // 그래프를 인접리스트로 변환하기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adjList[start].add(end);
            adjList[end].add(start);
        }
        for (int i = 1; i < adjList.length; i++) {
            Collections.sort(adjList[i]);
        }

        cnt = 1;
        dfs(R);

        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int R) {
        visited[R] = cnt;

        for (int next : adjList[R]) {
            if (visited[next] == 0) {
                cnt++;
                dfs(next);
            }
        }
    }
}
