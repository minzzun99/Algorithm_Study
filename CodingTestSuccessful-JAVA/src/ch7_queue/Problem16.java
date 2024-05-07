package ch7_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem16 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();

        int n = progresses.length;
        int[] days = new int[n];

        for (int i = 0; i < days.length; i++) {
            days[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        int count = 0;
        int maxDay = days[0];

        for (int i = 0; i < n; i++) {
            if (days[i] <= maxDay) {
                count++;
            } else {
                queue.add(count);
                maxDay = days[i];
                count = 1;
            }
        }
        queue.add(count);
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }
}
