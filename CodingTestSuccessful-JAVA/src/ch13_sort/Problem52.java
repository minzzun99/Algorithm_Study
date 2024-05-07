package ch13_sort;

import java.util.Arrays;

public class Problem52 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1,o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            } else {
                return Character.compare(o1.charAt(n), o2.charAt(n));
            }
        });
        return strings;
    }
}
