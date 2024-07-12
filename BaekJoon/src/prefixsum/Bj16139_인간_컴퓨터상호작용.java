package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj16139_인간_컴퓨터상호작용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str = br.readLine();
        int[][] count = new int[26][str.length() + 1];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a'][i + 1]++;
            for (int j = 0; j < 26; j++) {
                count[j][i + 1] += count[j][i];
            }
        }

        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            char c = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(count[c - 'a'][end + 1] - count[c - 'a'][start]).append('\n');
        }
        System.out.println(sb);
    }
}
