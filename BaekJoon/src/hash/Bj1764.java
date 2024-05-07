package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String str;
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            map.put(str, 0);
        }

        for (int i = 0; i < M; i++) {
            str = br.readLine();
            if (map.containsKey(str)) {
                resultMap.put(str, 0);
            }
        }

        System.out.println(resultMap.size());
        resultMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
