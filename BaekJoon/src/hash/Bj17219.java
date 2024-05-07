package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> pwMap = new HashMap<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String domain = st.nextToken();
            String password = st.nextToken();
            pwMap.put(domain, password);
        }
        while (M-- > 0) {
            String findPW = br.readLine();
            sb.append(pwMap.get(findPW)).append('\n');
        }

        System.out.println(sb);
    }
}
