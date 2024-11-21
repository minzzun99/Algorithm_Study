package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj30805_사전순최대공통부분수열 {
    private static int N, M;
    private static List<Integer> A;
    private static List<Integer> B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        A = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        M = Integer.parseInt(br.readLine());
        B = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> result = getLCS();
        sb.append(result.size()).append('\n');
        if (!result.isEmpty()) {
            for (int i : result) {
                sb.append(i).append(' ');
            }
        }

        System.out.println(sb);
    }

    private static List<Integer> getLCS() {
        List<Integer> list = new ArrayList<>();
        int idxA = 0;
        int idxB = 0;

        while (idxA < N && idxB < M) {
            int max = -1;
            int tmpA = -1;
            int tmpB = -1;

            for (int i = idxA; i < N; i++) {
                for (int j = idxB; j < M; j++) {
                    if (A.get(i).equals(B.get(j)) && A.get(i) > max) {
                        max = A.get(i);
                        tmpA = i;
                        tmpB = j;
                    }
                }
            }

            if (max == -1) {
                break;
            }

            list.add(max);
            idxA = tmpA + 1;
            idxB = tmpB + 1;
        }

        return list;
    }
}
