package ch12_backtracking;

import java.util.ArrayList;

public class Problem43 {
    private static ArrayList<ArrayList<Integer>> result;
    private static int n;

    private static void backtrack(int sum, ArrayList<Integer> selectNums, int start) {
        if (sum == 10) {
            result.add(selectNums);
            return;
        }
        for (int i = start; i <= n; i++) {
            if (sum + i <= 10) {
                ArrayList<Integer> list = new ArrayList<>(selectNums);
                list.add(i);
                backtrack(sum + i, list, i + 1);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> solution(int N) {
        n = N;
        result = new ArrayList<>();
        backtrack(0, new ArrayList<>(), 1);
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> answer = solution(n);
        for (ArrayList<Integer> list : answer) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
