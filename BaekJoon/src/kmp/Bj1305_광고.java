package kmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1305_광고 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String target = br.readLine();
        int lastPi = getLastPi(target, L);
        System.out.println(L - lastPi);
    }

    private static int getLastPi(String t, int n) {
        int[] pi = new int[n];
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (j > 0 && t.charAt(i) != t.charAt(j)) {
                j = pi[j - 1];
            }
            if (t.charAt(i) == t.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi[n - 1];
    }
}
