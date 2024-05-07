package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj25325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());        // 학생 수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = st.nextToken();
            map.put(name, 0);
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                String name = st.nextToken();
                map.put(name, map.get(name) + 1);
            }
        }

        List<String> mapKey = new ArrayList<>(map.keySet());

        mapKey.sort((o1, o2) -> {
            if (map.get(o1) - map.get(o2) == 0) {
                return o1.compareTo(o2);
            } else {
                return Integer.compare(map.get(o2), map.get(o1));
            }
        });

        for (String str : mapKey) {
            System.out.println(str + " " + map.get(str));
        }
    }
}
