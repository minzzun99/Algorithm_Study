package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Bj13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < l; i++) {
            String num = br.readLine();
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
                set.add(num);
            }
        }
        for (String s : set) {
            if (k <= 0) {
                break;
            }
            sb.append(s).append('\n');
            k--;
        }
        System.out.println(sb);
    }
}
