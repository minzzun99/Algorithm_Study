package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj18110_SolvedAc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(score);

        // 절사평균 구하기
        // n명의 15퍼센트
        int delete = Integer.parseInt(String.format("%.0f", (n * 0.15)));
        double sum = 0;
        for(int i = delete; i < n - delete; i++) {
            sum += score[i];
        }
        String avg = String.format("%.0f", sum / (n - (delete * 2)));
        System.out.println(avg);
    }
}
