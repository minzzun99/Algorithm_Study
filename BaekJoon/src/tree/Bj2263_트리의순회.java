package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2263_트리의순회 {
    private static int N;
    private static int[] inOrder;
    private static int[] postOrder;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        inOrder = initArr(br.readLine());
        postOrder = initArr(br.readLine());

        getPreOreder(0, N - 1, 0, N - 1);

        System.out.println(sb);
    }

    private static int[] initArr(String input) {
        StringTokenizer st = new StringTokenizer(input);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        return arr;
    }

    private static void getPreOreder(int inS, int inE, int postS, int postE) {
        if (inS <= inE && postS <= postE) {
            int root = postOrder[postE];
            sb.append(root).append(' ');

            int rootIdx = inS;
            for (int i = inS; i <= inE; i++) {
                if (inOrder[i] == root) {
                    rootIdx = i;
                    break;
                }
            }

            getPreOreder(inS, rootIdx - 1, postS, postS + rootIdx - inS - 1);
            getPreOreder(rootIdx + 1, inE, postS + rootIdx - inS, postE - 1);
        }
    }
}
