package ch7_queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Problem17 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Deque<String> card1Deque = new ArrayDeque<>(Arrays.asList(cards1));
        Deque<String> card2Deque = new ArrayDeque<>(Arrays.asList(cards2));
        Deque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));

        while (!goalDeque.isEmpty()) {
            if (!card1Deque.isEmpty() && goalDeque.peekFirst().equals(card1Deque.peekFirst())) {
                card1Deque.pollFirst();
                goalDeque.pollFirst();
            } else if (!card2Deque.isEmpty() && goalDeque.peekFirst().equals(card2Deque.peekFirst())) {
                card2Deque.pollFirst();
                goalDeque.pollFirst();
            } else {
                break;
            }
        }

        if (goalDeque.isEmpty()) {
            return "Yes";
        } else {
            return "No";
        }
    }
}