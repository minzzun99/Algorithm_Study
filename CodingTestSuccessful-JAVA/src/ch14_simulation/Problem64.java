package ch14_simulation;

public class Problem64 {
    public static int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        int[] answer = new int[2];
        for (int i = 3; i < area; i++) {
            int j = area / i;

            if ((area % i) == 0 && (j >= 3)) {
                int wid = Math.max(i, j);
                int len = Math.min(i, j);
                int yellowArea = (wid - 2) * (len - 2);

                if (yellowArea == yellow) {
                    answer[0] = wid;
                    answer[1] = len;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int br = 24;
        int ye = 24;
        int[] arr = solution(br, ye);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
