package ch13_sort;

import java.util.Arrays;
import java.util.HashSet;

public class Problem58 {
    public static boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));
        for (String s : phone_book) {
            for (int i = 1; i < s.length(); i++) {
                if (set.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean answer = solution(phone_book);
        System.out.println(answer);
    }
}
