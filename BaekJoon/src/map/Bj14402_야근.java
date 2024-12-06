package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj14402_야근 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> record = new HashMap<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            char type = st.nextToken().charAt(0);

            if (type == '+') {
                record.put(name, record.getOrDefault(name, 0) + 1);
            } else {
                if (!record.containsKey(name)) {
                    record.put(name, 0);
                    count++;
                } else {
                    if (record.get(name) == 0) {
                        count++;
                    } else {
                        record.put(name, record.get(name) - 1);
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> entry : record.entrySet()) {
            count += entry.getValue();
        }

        System.out.println(count);
    }
}
