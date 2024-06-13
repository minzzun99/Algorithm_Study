package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2966_찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String answer = br.readLine();
        char[] Adrian = {'A', 'B', 'C'};
        char[] Bruno = {'B', 'A', 'B', 'C'};
        char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};
        boolean flag = true;
        String[] name = {"Adrian", "Bruno", "Goran"};
        int[] answerCount = new int[3];

        for (int i = 0; i < answer.length(); i++) {
            for (int j = 0; j < Adrian.length; j++) {
                if (i + j >= answer.length()) {
                    flag = false;
                    break;
                }
                if (answer.charAt(i + j) == Adrian[j])
                    answerCount[0]++;
            }
            if (!flag)
                break;
            i += Adrian.length - 1;
        }

        flag = true;
        for (int i = 0; i < answer.length(); i++) {
            for (int j = 0; j < Bruno.length; j++) {
                if (i + j >= answer.length()) {
                    flag = false;
                    break;
                }
                if (answer.charAt(i + j) == Bruno[j])
                    answerCount[1]++;
            }
            if (!flag)
                break;
            i += Bruno.length - 1;
        }

        flag = true;
        for (int i = 0; i < answer.length(); i++) {
            for (int j = 0; j < Goran.length; j++) {
                if (i + j >= answer.length()) {
                    flag = false;
                    break;
                }
                if (answer.charAt(i + j) == Goran[j])
                    answerCount[2]++;
            }
            if (!flag)
                break;
            i += Goran.length - 1;
        }

        int max = 0;
        for (int i = 0; i < answerCount.length; i++) {
            if (answerCount[i] > max)
                max = answerCount[i];
        }
        System.out.println(max);

        for (int i = 0; i < name.length; i++) {
            if (max == answerCount[i])
                System.out.println(name[i]);
        }
    }
}
