package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), ".");
            String name = st.nextToken();
            String ext = st.nextToken();
            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (String str : list) {
            sb.append(str).append(" ").append(map.get(str)).append('\n');
        }
        System.out.println(sb);
    }
}
