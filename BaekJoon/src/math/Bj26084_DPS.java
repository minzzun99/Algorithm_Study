package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj26084_DPS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Long> teamCountMap = new HashMap<>();
        Map<Character, Long> handleCountMap = new HashMap<>();

        String teamString = br.readLine();
        for (int i = 0; i < teamString.length(); i++) {
            char ch = teamString.charAt(i);
            teamCountMap.put(ch, teamCountMap.getOrDefault(ch, 0L) + 1);
        }

        int handleCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < handleCount; i++) {
            String handle = br.readLine();
            char firstChar = handle.charAt(0);
            handleCountMap.put(firstChar, handleCountMap.getOrDefault(firstChar, 0L) + 1);
        }

        long result = 1L;

        for (Map.Entry<Character, Long> entry : teamCountMap.entrySet()) {
            char teamChar = entry.getKey();
            long teamCharCount = entry.getValue();

            long availableHandles = handleCountMap.getOrDefault(teamChar, 0L);

            if (availableHandles < teamCharCount) {
                result = 0;
                break;
            }

            long numerator = 1L;
            long denominator = 1L;

            for (long i = teamCharCount; i > 0; i--) {
                numerator *= availableHandles;
                availableHandles--;
                denominator *= teamCharCount;
                teamCharCount--;
            }

            result *= numerator / denominator;
        }

        System.out.println(result);
    }
}