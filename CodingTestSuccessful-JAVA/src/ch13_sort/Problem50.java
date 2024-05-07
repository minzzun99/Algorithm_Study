package ch13_sort;

public class Problem50 {
    public static String solution(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < counts[i]; i++) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("hello"));
    }
}
