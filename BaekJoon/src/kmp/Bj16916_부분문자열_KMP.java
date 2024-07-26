package kmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj16916_부분문자열_KMP {
    private static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();
        int[] pi = getPi(P);
        boolean result = kmp_Search(pi, S, P);
        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
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

    private static boolean kmp_Search(int[] pi, String target, String pattern) {
        N = target.length();
        boolean result = false;
        int j = 0;
        for (int i = 0; i < N; i++) {
            while (j > 0 && target.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (target.charAt(i) == pattern.charAt(j)) {
                if (j == M - 1) {
                    result = true;
                    break;
                } else {
                    j++;
                }
            }
        }
        return result;
    }
}
