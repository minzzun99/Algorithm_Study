package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Bj30389_SuffiX {
    private static HashMap<String, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        while (N-- > 0) {
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                String s = str.substring(i);
                if(!map.containsKey(s)) {
                    map.put(s, 0);
                } else {
                    map.remove(s);
                }
            }
        }
        System.out.println(map.size());
    }
}
