package kmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bj1786_찾기 {
    private static int count = 0;
    private static ArrayList<Integer> idxList;
    private static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String Target = br.readLine();
        String Pattern = br.readLine();
        int[] pi = getPi(Pattern);
        KMP_Search(pi, Pattern, Target);
        sb.append(count).append('\n');
        for (int i : idxList) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }

    private static int[] getPi(String pattern) {
        M = pattern.length();
        int[] pi = new int[M];
        int j = 0;
        for (int i = 1; i < M; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }

    private static void KMP_Search(int[] pi, String pattern, String target) {
        N = target.length();
        idxList = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < N; i++) {
            while (j > 0 && target.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (target.charAt(i) == pattern.charAt(j)) {
                if (j == M - 1) {
                    count++;
                    j = pi[j];
                    idxList.add(i - M + 2);
                } else {
                    j++;
                }
            }
        }
    }
}
