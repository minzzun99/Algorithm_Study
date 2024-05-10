package ch16_greedy;

import java.util.Arrays;

public class Problem80 {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i += 1;
            }
            j -= 1;
            count += 1;
        }
        return count;
    }
}
