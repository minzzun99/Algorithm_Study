package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj20413_MVP다이아몬드_EASY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] mvpArr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            int amount = Integer.parseInt(st.nextToken());
            mvpArr[i] = amount - 1;
        }
        mvpArr[4] = mvpArr[3] + 1;

        int sum = 0;
        int prev = 0;
        char[] rank = br.readLine().toCharArray();
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == 'B') {
                prev = mvpArr[0] - prev;
            } else if (rank[i] == 'S') {
                prev = mvpArr[1] - prev;
            } else if (rank[i] == 'G') {
                prev = mvpArr[2] - prev;
            } else if (rank[i] == 'P') {
                prev = mvpArr[3] - prev;
            } else {
                prev = mvpArr[4];
            }
            sum += prev;
        }
        System.out.println(sum);
    }
}
