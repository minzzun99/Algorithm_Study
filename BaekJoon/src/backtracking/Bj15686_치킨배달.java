package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj15686_치킨배달 {
    private static int N, M;
    private static int[][] map;
    private static ArrayList<Node> chicken;
    private static ArrayList<Node> home;
    private static boolean[] openChicken;
    private static int minDist = Integer.MAX_VALUE;

    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        chicken = new ArrayList<>();
        home = new ArrayList<>();

        map = new int[N + 1][N + 1];
        for (int i = 1; i < map.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j < map[i].length; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 1) {
                    home.add(new Node(i, j));
                } else if (map[i][j] == 2) {
                    chicken.add(new Node(i, j));
                }
            }
        }

        openChicken = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(minDist);
    }

    private static void dfs(int start, int count) {
        if (count == M) {
            int distSum = 0;

            for (int i = 0; i < home.size(); i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < chicken.size(); j++) {
                    if (openChicken[j]) {
                        int dist = Math.abs(home.get(i).x - chicken.get(j).x)
                                + Math.abs(home.get(i).y - chicken.get(j).y);

                        min = Math.min(min, dist);
                    }
                }
                distSum += min;
            }
            minDist = Math.min(minDist, distSum);
            return;
        }

        for (int i = start; i < openChicken.length; i++) {
            openChicken[i] = true;
            dfs(i + 1, count + 1);
            openChicken[i] = false;
        }
    }
}
