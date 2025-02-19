package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2953_나는요리사다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] score = new int[5];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            score[i] = sum;
        }

        int num = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (max < score[i]) {
                num = i + 1;
                max = score[i];
            }
        }

        System.out.println(num + " " + max);
    }
}
