package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2511_카드놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arrA = new int[10];
        int[] arrB = new int[10];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrA.length; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        int scoreA = 0;
        int scoreB = 0;
        char result = ' ';
        int drawCount = 0;
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] > arrB[i]) {
                scoreA += 3;
                result = 'A';
            } else if (arrA[i] < arrB[i]) {
                scoreB += 3;
                result = 'B';
            } else {
                scoreA++;
                scoreB++;
                drawCount++;
            }
        }

        sb.append(scoreA).append(' ').append(scoreB).append('\n');
        if (drawCount == 10) {
            sb.append('D');
        } else {
            if (scoreA > scoreB) {
                sb.append('A');
            } else if (scoreA < scoreB) {
                sb.append('B');
            } else {
                sb.append(result);
            }
        }
        System.out.println(sb);
    }
}
