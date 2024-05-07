package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj2866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String[] arr = new String[C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                if (i == 0) {
                    arr[j] = String.valueOf(str.charAt(j));
                } else {
                    arr[j] += String.valueOf(str.charAt(j));
                }
            }
        }

        if (R == 2) {
            System.out.println(0);
        } else {
            for (int i = 1; i < R - 1; i++) {
                Set<String> set = new HashSet<>();
                for (int j = 0; j < C; j++) {
                    String s = arr[j].substring(i);
                    if (set.contains(s)) {
                        System.out.println(i-1);        // 2줄 지웠는데 중복이 있으면 count = 1
                        return;
                    } else {
                        set.add(s);
                    }
                }
            }
            System.out.println(R-1);        // 한줄 빼고 다 지웠는데도 중복 없는 경우
        }
    }
}
