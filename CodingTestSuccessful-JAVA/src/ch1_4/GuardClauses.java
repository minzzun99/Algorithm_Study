package ch1_4;

import java.util.List;

public class GuardClauses {
    static double calculateAverage(List<Integer> numbers) {
        if(numbers == null) {
            return 0;
        }
        if (numbers.isEmpty()) {
            return 0;
        }

        int total = numbers.stream().mapToInt(i -> i).sum();
        return (double) total / numbers.size();
    }
}
