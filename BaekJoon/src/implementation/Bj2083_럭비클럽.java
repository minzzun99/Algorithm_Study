package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2083_럭비클럽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String str = br.readLine();
            if (str.equals("# 0 0")) {
                break;
            }

            st = new StringTokenizer(str, " ");
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            sb.append(name).append(" ");
            if (age > 17 || weight >= 80) {
                sb.append("Senior");
            } else {
                sb.append("Junior");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
