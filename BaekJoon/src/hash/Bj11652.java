package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Long, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long cardNum = Long.parseLong(br.readLine());
            hashMap.put(cardNum, hashMap.getOrDefault(cardNum, 1) + 1);
        }

        int max = 0;
        long card = Long.MAX_VALUE;
        for (Map.Entry<Long, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                card = entry.getKey();
            } else if (max == entry.getValue()) {
                card = Math.min(card, entry.getKey());
            }
        }
        System.out.println(card);
    }
}
