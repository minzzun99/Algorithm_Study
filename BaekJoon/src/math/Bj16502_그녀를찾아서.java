package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj16502_그녀를찾아서 {
    private static class Move{
        int dest;
        double percent;

        public Move(int dest, double percent) {
            this.dest = dest;
            this.percent = percent;
        }
    }

    private static int T, M;
    private static double[] per;
    private static ArrayList<Move>[] adjList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        per = new double[4];
        adjList = new ArrayList[4];

        for (int i = 0; i < 4; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            char s = st.nextToken().charAt(0);
            char d = st.nextToken().charAt(0);
            double p = Double.parseDouble(st.nextToken());
            adjList[s - 'A'].add(new Move(d - 'A', p));
        }

        for (int i = 0; i < 4; i++) {
            dfs(i, 0.25, 0);
        }

        for (int i = 0; i < 4; i++) {
            sb.append(String.format("%.2f", per[i])).append('\n');
        }
        System.out.println(sb);
    }

    private static void dfs(int now, double percent, int depth) {
        if (depth == T) {
            per[now] += percent * 100;
            return;
        }

        for (Move move : adjList[now]) {
            dfs(move.dest, percent * move.percent, depth + 1);
        }
    }
}
