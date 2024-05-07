package ch13_sort;

import java.util.Arrays;
import java.util.HashSet;

public class Problem56 {
    public static int[] solution(String s) {
        s = s.substring(0, s.length() - 2).replace("{", "");
        String[] arr = s.split("},");
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        HashSet<String> set = new HashSet<>();
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String[] num = arr[i].split(",");
            for (String str : num) {
                if (!set.contains(str)) {
                    answer[i] = Integer.parseInt(str);
                    set.add(str);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] answer = solution(s);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
