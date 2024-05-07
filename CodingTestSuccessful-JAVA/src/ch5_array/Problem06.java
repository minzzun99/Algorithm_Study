package ch5_array;

import java.util.*;

public class Problem06 {
    public static int[] solution(int N, int[] stages) {
        int[] num = new int[N+2];       //N번째 스테이지를 클리어 한 사람의 스테이지는 N+1이기 때문에
        for(int i = 0; i < stages.length; i++) {
            num[stages[i]] += 1;
        }

        HashMap<Integer, Double> fail = new HashMap<>();
        double total = stages.length;

        for (int i = 1; i <= N; i++) {
            if (num[i] == 0) {
                fail.put(i, 0.0);
            } else {
                fail.put(i, num[i] / total);
                total -= num[i];
            }
        }

        return fail.entrySet()
                .stream()
                .sorted( ((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
