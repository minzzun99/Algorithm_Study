package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            Map<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();	// 옷 이름은 필요 없음
                String type = st.nextToken();	// 옷 종류

                if (map.containsKey(type)) {
                    map.put(type, map.get(type) + 1);
                }
                else {
                    map.put(type, 1);
                }
            }
            int result = 1;
            for (int x : map.values()) {
                result *= (x + 1);          // 안입는 경우
            }
            sb.append(result - 1).append('\n');     // 알몸인 경우

        }
        System.out.println(sb);
    }
}


/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            Map<String, Set<String>> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                String clothes = st.nextToken();
                String type = st.nextToken();

                if (!map.containsKey(type)) {
                    map.put(type, new HashSet<>());
                }
                map.get(type).add(clothes);
            }

            int result = 1;
            for (Set<String> clothesSet : map.values()) {
                result *= clothesSet.size() + 1;                // 각 키의 셋의 크기를 곱하여 결과에 더함
            }

            sb.append(result - 1).append('\n');
        }
        System.out.println(sb);
    }
}*/

