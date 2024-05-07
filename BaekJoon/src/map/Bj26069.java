package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Map<String, Boolean> map = new HashMap<>();
        int sum = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            if (!map.containsKey(str1)) {
                map.put(str1, false);
            }
            if (!map.containsKey(str2)) {
                map.put(str2, false);
            }

            //총총이 입력되거나 둘 중 한명이 true이면 둘 다 true
            if (str1.equals("ChongChong") || str2.equals("ChongChong") || map.get(str1) || map.get(str2)) {
                map.put(str1, true);
                map.put(str2, true);
            }
        }

        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
