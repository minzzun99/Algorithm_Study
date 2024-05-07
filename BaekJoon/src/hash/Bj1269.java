package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> resultMap = new HashMap<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            int x = Integer.parseInt(st.nextToken());
            resultMap.put(x, 0);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (resultMap.containsKey(x)) {
                resultMap.remove(x);
            } else {
                resultMap.put(x, 0);
            }
        }
        System.out.println(resultMap.size());
    }
}
