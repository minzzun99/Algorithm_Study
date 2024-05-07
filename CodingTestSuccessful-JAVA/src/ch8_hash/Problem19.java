package ch8_hash;

import java.util.HashMap;

public class Problem19 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : completion) {
            if (hashMap.containsKey(str)) {
                int value = hashMap.get(str); // 현재 값 가져오기
                hashMap.put(str, value + 1);
            } else {
                hashMap.put(str, 1);
            }
        }

        for (String str : participant) {
            if (!hashMap.containsKey(str) || hashMap.get(str) == 0) {
                return str;
            } else {
                int value = hashMap.get(str); // 현재 값 가져오기
                hashMap.put(str, value - 1);
            }
        }
        return null;
    }
}
