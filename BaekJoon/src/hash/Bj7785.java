package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        String name, EoL;
        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            name = st.nextToken();
            EoL = st.nextToken();
            if (EoL.equals("enter")) {
                hashMap.put(name, 0);
            } else {
                hashMap.remove(name);
            }
        }

        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey((Comparator.reverseOrder())))
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
