package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            if(!hashMap.containsKey(s)) {
                hashMap.put(s, 1);
            }else {
                hashMap.put(s, hashMap.get(s) + 1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            String s = st.nextToken();
            if (!hashMap.containsKey(s)) {
                sb.append("0 ");
            } else {
                sb.append(hashMap.get(s)).append(" ");
            }
        }
        System.out.println(sb);
    }
}
