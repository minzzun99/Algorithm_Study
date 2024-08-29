package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Bj3213_피자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        map.put("1/4", 0);
        map.put("3/4", 0);
        map.put("1/2", 0);

        for (int i = 0; i < N; i++) {
            String size = br.readLine();
            map.put(size, map.get(size) + 1);
        }

        int pizza = 0;
        pizza += map.get("3/4");
        map.put("1/4", map.get("1/4") - map.get("3/4"));

        pizza += map.get("1/2") / 2;
        if (map.get("1/2") % 2 != 0) {
            pizza++;
            map.put("1/4", map.get("1/4") - 2);
        }

        if (map.get("1/4") > 0) {
            pizza += (map.get("1/4") / 4) + 1;
        }

        System.out.println(pizza);
    }
}
