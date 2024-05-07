package ch8_hash;

import java.util.*;

public class Problem24 {
    //만들 수 있는 메뉴 구성과 총 주문 수
    private static HashMap<Integer, HashMap<String, Integer>> courseMap;

    public String[] solution(String[] orders, int[] course) {
        courseMap = new HashMap<>();
        for (int i : course) {
            courseMap.put(i, new HashMap<>());
        }

        for (String order : orders) {
            char[] orderArr = order.toCharArray();
            Arrays.sort(orderArr);
            comb(0, orderArr, "");
        }

        ArrayList<String> answer = new ArrayList<>();

        for (HashMap<String, Integer> count : courseMap.values()) {
            count.values()
                    .stream()
                    .max(Comparator.comparingInt(o -> o))
                    .ifPresent(cnt -> count.entrySet()
                            .stream()
                            .filter(entry -> cnt.equals(entry.getValue()) && cnt > 1)
                            .forEach(entry -> answer.add(entry.getKey())));
        }
        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }

    public static void comb(int idx, char[] order, String result) {
        if (courseMap.containsKey(result.length())) {
            HashMap<String, Integer> map = courseMap.get(result.length());
            map.put(result, map.getOrDefault(result, 0) + 1);
        }

        for (int i = idx; i < order.length; i++) {
            comb(i + 1, order, result + order[i]);
        }
    }
}
