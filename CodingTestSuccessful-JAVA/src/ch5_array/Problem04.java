package ch5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < st.countTokens(); i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        int[] arr = arrayList.stream().mapToInt(Integer::intValue).toArray();
        int[] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
    public static int[] solution(int[] answers) {
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    score[j]++;
                }
            }
        }
        int maxScore = Arrays.stream(score).max().getAsInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                result.add(i + 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
