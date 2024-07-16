package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5525_IOIOI_KMP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("I");
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for (int i = 0; i < N; i++) {
            sb.append("OI");
        }
        String Pn = sb.toString();
        int[] pi = getPi(Pn);
        int answer = KMPsearch(pi, Pn, S);
        System.out.println(answer);
    }

    private static int[] getPi(String pattern) {
        int[] pi = new int[pattern.length()];
        int j = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }

    private static int KMPsearch(int[] pi, String pattern, String S) {
        int answer = 0;
        int j = 0;
        for (int i = 0; i < S.length(); i++) {
            while (j > 0 && S.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (S.charAt(i) == pattern.charAt(j)) {
                if (j == pattern.length() - 1) {
                    answer++;
                    j = pi[j];
                } else {
                    j++;
                }
            }
        }
        return answer;
    }
}
