package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj6550_부분문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str == null) {
                break;
            }
            st = new StringTokenizer(str, " ");
            String A = st.nextToken();
            String B = st.nextToken();

            int index = 0;
            for (int i = 0; i < B.length(); i++) {
                if (A.charAt(index) == B.charAt(i)) {
                    index++;
                }
                if (index == A.length()) {
                    break;
                }
            }

            if (index >= A.length()) {
                sb.append("Yes").append('\n');
            } else {
                sb.append("No").append('\n');
            }
        }

        System.out.println(sb);
    }
}
