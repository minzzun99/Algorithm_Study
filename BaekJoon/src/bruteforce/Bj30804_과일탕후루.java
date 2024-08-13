package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj30804_과일탕후루 {
    private static int N;
    private static int[] fruits;
    private static HashMap<Integer, Integer> fruitsMap;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        fruits = new int[N];
        fruitsMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(getMaxLength());
    }

    private static int getMaxLength() {
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < N; right++) {
            fruitsMap.put(fruits[right], fruitsMap.getOrDefault(fruits[right], 0) + 1);

            while (fruitsMap.size() > 2) {
                fruitsMap.put(fruits[left], fruitsMap.get(fruits[left]) - 1);
                if (fruitsMap.get(fruits[left]) == 0) {
                    fruitsMap.remove(fruits[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
