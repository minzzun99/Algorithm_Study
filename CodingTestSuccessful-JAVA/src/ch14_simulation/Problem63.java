package ch14_simulation;

import java.util.HashMap;
import java.util.HashSet;

public class Problem63 {
    public static int solution(int[] topping) {
        int answer = 0;

        // 토핑의 개수를 세어서 해시맵에 저장
        HashMap<Integer, Integer> toppingMap = new HashMap<>();
        for (int i : topping) {
            toppingMap.put(i, toppingMap.getOrDefault(i, 0) + 1);
        }

        // 토핑의 종류 저장
        HashSet<Integer> toppingSet = new HashSet<>();

        for (int i : topping) {
            toppingSet.add(i);
            toppingMap.put(i, toppingMap.get(i) - 1);

            // 한개도 없으면 삭제
            if (toppingMap.get(i) == 0) {
                toppingMap.remove(i);
            }

            if (toppingSet.size() == toppingMap.size()) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] topping = {1,2,3,1,4};
        System.out.println(solution(topping));
    }
}
