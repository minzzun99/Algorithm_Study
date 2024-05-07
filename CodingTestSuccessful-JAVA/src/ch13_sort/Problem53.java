package ch13_sort;

import java.util.Arrays;
import java.util.Collections;

public class Problem53 {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }
}
