package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj6603_로또 {
    private static int[] arr;
    private static int K;
    private static List<String> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }

            st = new StringTokenizer(str, " ");
            K = Integer.parseInt(st.nextToken());
            arr = new int[K];
            result = new ArrayList<>();

            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            backTracking(0, 0, "");

            for (String s : result) {
                sb.append(s).append('\n');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static void backTracking(int start, int depth, String answer) {
        if (depth == 6) {
            result.add(answer.trim());
            return;
        }

        for (int i = start; i < K; i++) {
            backTracking(i + 1, depth + 1, answer + arr[i] + " ");
        }
    }
}
