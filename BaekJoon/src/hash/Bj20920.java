package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        while (N-- > 0) {
            String str = br.readLine();
            if (str.length() >= M) {
                map.put(str, map.getOrDefault(str, 1) + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //자주 나오는 단어일수록 앞에 배치한다.
                if (Integer.compare(map.get(o1), map.get(o2)) != 0) {       //원소 개수가 같지 않다면
                    return Integer.compare(map.get(o2), map.get(o1));
                }
                //해당 단어의 길이가 길수록 앞에 배치한다.
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
                return o1.compareTo(o2);
            }
        });

        for (String s : list) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
