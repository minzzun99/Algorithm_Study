package ch10_set;

import java.util.HashSet;
import java.util.Set;

public class Problem32 {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        char prevWord = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i]) || words[i].charAt(0) != prevWord) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            set.add(words[i]);
            prevWord = words[i].charAt(words[i].length() - 1);
        }
        return new int[]{0, 0};
    }
}
