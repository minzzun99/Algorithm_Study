package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        //나무의 총 개수
        int total = 0;
        String str;
        while ((str = br.readLine()) != null) {
            total++;
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<String> treeList = new ArrayList<>(map.keySet());
        Collections.sort(treeList);

        for (String s : treeList) {
            int count = map.get(s);
            double per = (count * 100.0) / total;
            sb.append(s).append(" ").append(String.format("%.4f", per)).append("\n");
        }
        System.out.println(sb);
    }
}
