package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj17287_TheDeeper_TheBetter {
    private static class NumberScore {
        int number;
        int score;

        NumberScore(int number, int score) {
            this.number = number;
            this.score = score;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<NumberScore> list = new ArrayList<>();
        int score = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                score += 1;
            } else if (c == '{') {
                score += 2;
            } else if (c == '[') {
                score += 3;
            } else if (c == ')') {
                score -= 1;
            } else if (c == '}') {
                score -= 2;
            } else if (c == ']') {
                score -= 3;
            } else {
                list.add(new NumberScore(c - '0', score));
            }
        }
        list.sort((o1,o2) -> {
            return Integer.compare(o2.score, o1.score);
        });
        System.out.println(list.get(0).score);
    }
}
