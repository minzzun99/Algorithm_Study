package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj1235_학생번호 {
    private static int N;
    private static String[] students;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        students = new String[N];
        for (int i = 0; i < N; i++) {
            students[i] = br.readLine();
        }

        System.out.println(minK(students[0].length()));
    }

    private static int minK(int length) {
        Map<String, Integer> map;
        for (int i = 0; i < length; i++) {
            map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                String str = students[j].substring(length - i - 1);
                if (!map.containsKey(str)) {
                    map.put(str, 0);
                } else {
                    break;
                }
            }
            if (map.size() == N) {
                return i + 1;
            }
        }
        return length;
    }
}
