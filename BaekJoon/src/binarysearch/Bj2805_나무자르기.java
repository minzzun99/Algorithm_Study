package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2805_나무자르기 {
    private static int[] tree;
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        tree = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        int max = 0;
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (tree[i] > max) {
                max = tree[i];
            }
        }

        int start = 0;
        int end = max;

        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (isPossible(mid)) {
                start = mid;
            } else {
                end = mid;
            }
        }
        System.out.println(start);
    }

    private static boolean isPossible(int height) {
        long sum = 0;
        long treeHeight;
        for (int i = 0; i < N; i++) {
            if (tree[i] >= height) {
                treeHeight = tree[i] - height;
                sum += treeHeight;
            }
        }
        if (sum >= M) {
            return true;
        } else {
            return false;
        }
    }
}
