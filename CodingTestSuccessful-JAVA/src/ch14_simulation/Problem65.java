package ch14_simulation;

public class Problem65 {
    public static int solution(int n) {
        int energy = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                energy++;
            }
            n/=2;
        }
        return energy;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
