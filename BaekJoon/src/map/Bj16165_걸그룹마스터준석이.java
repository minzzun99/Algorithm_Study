package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj16165_걸그룹마스터준석이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String, List<String>> map = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        while (N-- > 0) {
            String group = br.readLine();
            int num = Integer.parseInt(br.readLine());
            List<String> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                String name = br.readLine();
                list.add(name);
            }
            map.put(group, list);
        }
        while (M-- > 0) {
            String str = br.readLine();
            int quizType = Integer.parseInt(br.readLine());
            if (quizType == 1) {
                for (String group : map.keySet()) {
                    if (map.get(group).contains(str)) {
                        sb.append(group).append('\n');
                    }
                }
            } else {
                // 팀 멤버 이름 사전 순으로 출력
                List<String> list = map.get(str);
                Collections.sort(list);
                for (String s : list) {
                    sb.append(s).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
