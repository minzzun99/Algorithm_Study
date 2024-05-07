package ch10_set;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem30 {
    private static int[] parent;

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);
        parent[y] = x;
    }

    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public static Boolean[] solution(int k, int[][] operations) {
        parent = new int[k];
        for (int i = 0; i < k; i++) {
            parent[i] = i;
        }

        ArrayList<Boolean> answer = new ArrayList<>();

        for (int[] op : operations) {
            if (op[0] == 0) {
                union(op[1], op[2]);
            } else {
                answer.add(find(op[1]) == find(op[2]));
            }
        }
        return answer.toArray(new Boolean[0]);
    }

    public static void main(String[] args) {
        int k = 4;
        int[][] operations = {{0, 0, 1}, {1, 1, 2}, {0, 1, 2}, {1,0,2}};
        Boolean[] answer = solution(k, operations);

        Arrays.stream(answer).forEach(System.out::println);
    }
}
