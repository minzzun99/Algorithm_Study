package ch14_simulation;

public class Problem62 {
    public static int[] solution(String s) {
        int countBinary = 0;      // 변환횟수
        int deleteZero = 0;

        while (!s.equals("1")) {
            countBinary++;

            int zero = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    zero++;
                }
            }
            deleteZero += zero;

            s = Integer.toBinaryString(s.length() - zero);
        }
        return new int[]{countBinary, deleteZero};
    }

    public static void main(String[] args) {
        String s = "01110";
        int[] arr = solution(s);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
