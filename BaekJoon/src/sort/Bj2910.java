package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        List<Integer> origin = new ArrayList<>();           // 누가 먼저 입력됐는지
        Map<Integer, Integer> map = new HashMap<>();        // 빈도 수 저장

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            list.add(a);
            origin.add(a);
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        Collections.sort(list, (o1, o2) -> {
            if (map.get(o1) == map.get(o2)) {
                return origin.indexOf(o1) - origin.indexOf(o2);
            } else {
                return Integer.compare(map.get(o2), map.get(o1));
            }
        });

        list.stream().mapToInt(Integer::intValue).forEach(i -> System.out.print(i + " "));
    }
}
