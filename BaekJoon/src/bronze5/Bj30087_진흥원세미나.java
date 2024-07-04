package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj30087_진흥원세미나 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<String, String> classMap = new HashMap<>();
        classMap.put("Algorithm", "204");
        classMap.put("DataAnalysis", "207");
        classMap.put("ArtificialIntelligence", "302");
        classMap.put("CyberSecurity", "B101");
        classMap.put("Network", "303");
        classMap.put("Startup", "501");
        classMap.put("TestStrategy", "105");

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            sb.append(classMap.get(str)).append('\n');
        }
        System.out.println(sb);
    }
}
