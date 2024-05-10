package ch16_greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem81 {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> type = new HashMap<>();
        for (int i : tangerine) {
            type.put(i, type.getOrDefault(i, 0) + 1);
        }

        // 정렬
        List<Integer> sortType = new ArrayList<>(type.keySet());
        sortType.sort((o1,o2) -> {
            return Integer.compare(type.get(o2), type.get(o1));
        });

        int count = 0;
        for (int i : sortType) {
            if (k > 0) {
                k -= type.get(i);
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
