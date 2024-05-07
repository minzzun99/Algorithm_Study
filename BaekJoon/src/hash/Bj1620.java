package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> mapString = new HashMap<>();
        Map<String, Integer> mapInt = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            mapString.put(i, str);
            mapInt.put(str, i);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (isNum(str)) {
                sb.append(mapString.get(Integer.parseInt(str))).append('\n');
            } else {
                sb.append(mapInt.get(str)).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static boolean isNum(String str) { //숫자 체크 함수(숫자이면 true, 숫자아니면 false)
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {        //str.charAt(i))가 숫자인지를 판별하는 메서드 숫자가 아니면 false
                return false;
            }
        }
        return true;
    }
}
