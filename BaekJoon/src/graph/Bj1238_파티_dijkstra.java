package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1238_파티_dijkstra {
    private static class Node {
        int dest;
        int time;

        Node(int dest, int time) {
            this.dest = dest;
            this.time = time;
        }
    }

    private static int N, M, X;
    private static final int INF = Integer.MAX_VALUE;
    private static ArrayList<Node>[] forwardAdjList;
    private static ArrayList<Node>[] reverseAdjList;
    private static int[] goDist, backDist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        forwardAdjList = new ArrayList[N + 1];
        reverseAdjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            forwardAdjList[i] = new ArrayList<>();
            reverseAdjList[i] = new ArrayList<>();
        }

        goDist = new int[N + 1];
        backDist = new int[N + 1];
        Arrays.fill(goDist, INF);
        Arrays.fill(backDist, INF);

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            forwardAdjList[A].add(new Node(B, T));
            reverseAdjList[B].add(new Node(A, T));
        }

        setDist(backDist, forwardAdjList);
        setDist(goDist, reverseAdjList);

        int maxTime = 0;
        for (int i = 1; i <= N; i++) {
            maxTime = Math.max(maxTime, goDist[i] + backDist[i]);
        }
        System.out.println(maxTime);
    }

    private static void setDist(int[] dist, ArrayList<Node>[] adjList) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.time, o2.time));
        dist[X] = 0;
        pq.add(new Node(X, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > dist[now.dest] + next.time) {
                    dist[next.dest] = dist[now.dest] + next.time;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }
    }
}
