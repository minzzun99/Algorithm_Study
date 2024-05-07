package ch1_4;

import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //해시맵 값 삽입
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        System.out.println(map);

        String key = "apple";
        if(map.containsKey(key)) {
            int value = map.get(key);
            System.out.println(key + ": " + value);
        }else {
            System.out.println(key + "는 해시맵에 없습니다");
        }

        map.put("banana", 4);
        System.out.println(map);

        map.remove("orange");
        System.out.println(map);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);

        String key2 = "orange";

        if(hashMap.containsKey(key2)) {
            int value = hashMap.get(key2);
            System.out.println(key2 + ": " + value);
        }else {
            System.out.println(key2 + "는 해시맵에 없습니다.");
        }
    }
}
