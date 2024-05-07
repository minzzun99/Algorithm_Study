package ch9_tree;

public class Problem26 {
    public int solution(int n, int a, int b) {
        int answer;

        for (answer = 0; a != b; answer++) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }
        return answer;
    }
}
