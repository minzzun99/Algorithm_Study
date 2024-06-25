package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Bj7662_이중우선순위큐 {
    private static TreeMap<Integer, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            map = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                char command = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                if (command == 'I') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else {
                    if (map.isEmpty()) {
                        continue;
                    }
                    int target;
                    if (num == 1) {
                        target = map.lastKey();
                    } else {
                        target = map.firstKey();
                    }
                    if (map.get(target) - 1 == 0) {
                        map.remove(target);
                    } else {
                        map.put(target, map.get(target) - 1);
                    }
                }
            }
            if (map.isEmpty()) {
                sb.append("EMPTY").append('\n');
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
