package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5671_호텔방번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean[] arr;

        while (true) {
            String str = br.readLine();
            if (str == null) {
                break;
            }

            st = new StringTokenizer(str, " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int count = 0;
            A : for (int i = N; i <= M; i++) {
                arr = new boolean[10];
                String s = String.valueOf(i);
                for (int j = 0; j < s.length(); j++) {
                    int idx = s.charAt(j) - '0';
                    if (arr[idx]) {
                        continue A;
                    }
                    arr[idx] = true;
                }
                count++;
            }
            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
