package ch8_hash;

import java.util.HashMap;

public class Problem20 {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        int answer = 0;     //총 일수 계산

        for (int i = 0; i < discount.length - 9; i++) {         // 가입기간이 10일이기때문에 가입 일자를 14 - 9
            HashMap<String, Integer> discountMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                if (wantMap.containsKey(discount[j])) {
                    discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
                }
            }
            if (discountMap.equals(wantMap)) {
                answer++;
            }
        }
        return answer;
    }
}
