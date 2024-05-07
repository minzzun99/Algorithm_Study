package programmers;

public class PGS12944 {
    public static double solution(int[] arr) {
        double sum = 0.;
        double answer = 0.;
        for (int i : arr) {
            sum += i;
        }
        answer = sum / arr.length;
        return answer;
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        System.out.println(solution(n));
    }
}
