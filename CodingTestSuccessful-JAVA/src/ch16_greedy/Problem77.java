package ch16_greedy;

import java.util.ArrayList;
public class Problem77 {
    public static int[] solution(int amount) {
        int[] denominations = {100, 50, 10, 1};

        ArrayList<Integer> list = new ArrayList<>();
        for (int coin : denominations) {
            while (amount >= coin) {
                list.add(coin);
                amount -= coin;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result = solution(123);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
