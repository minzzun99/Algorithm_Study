package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj1043_거짓말_UnionFind {
    private static int N, M;
    private static ArrayList<Integer>[] partyList;
    private static ArrayList<Integer> adjList;
    private static int[] parents;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        parents = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parents[i] = i;
        }

        st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        adjList = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            adjList.add(Integer.parseInt(st.nextToken()));
        }

        partyList = new ArrayList[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            partyList[i] = new ArrayList<>();
            int num = Integer.parseInt(st.nextToken());

            int x = Integer.parseInt(st.nextToken());
            partyList[i].add(x);
            for (int j = 0; j < num; j++) {
                int y = Integer.parseInt(st.nextToken());
                union(x, y);
                partyList[i].add(y);
            }
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            boolean flag = true;
            for (int num : partyList[i]) {
                if (adjList.contains(find(parents[num]))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }


    private static int find(int x) {
        if (parents[x] == x) {
            return x;
        }
        return find(parents[x]);
    }

    private static void union(int x, int y) {
        int rx = find(x);
        int ry = find(y);
        if (adjList.contains(ry)) {
            int tmp = rx;
            rx = ry;
            ry = tmp;
        }
        parents[ry] = rx;
    }
}