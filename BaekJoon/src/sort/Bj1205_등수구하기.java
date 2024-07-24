package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1205_등수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Integer[] scoreArr = new Integer[N];
        if (N == 0) {
            sb.append(1);
        } else {
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                scoreArr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(scoreArr, Collections.reverseOrder());
            if (N == P && score <= scoreArr[scoreArr.length - 1]) {
                sb.append(-1);
            } else {
                int rank = 1;
                for (int i = 0; i < scoreArr.length; i++) {
                    if (score < scoreArr[i]) {
                        rank++;
                    } else {
                        break;
                    }
                }
                sb.append(rank);
            }
        }
        System.out.println(sb);
    }
}
