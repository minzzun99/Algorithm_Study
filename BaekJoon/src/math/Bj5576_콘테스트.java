package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Bj5576_콘테스트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer[] arrW = new Integer[10];
        Integer[] arrK = new Integer[10];
        for (int i = 0; i < arrW.length; i++) {
            arrW[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arrK.length; i++) {
            arrK[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arrW, Collections.reverseOrder());
        Arrays.sort(arrK, Collections.reverseOrder());

        int scoreW = arrW[0] + arrW[1] + arrW[2];
        int scoreK = arrK[0] + arrK[1] + arrK[2];
        sb.append(scoreW).append(" ").append(scoreK);
        System.out.println(sb);
    }
}
