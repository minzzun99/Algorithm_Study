package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2902_KMP는왜KMP일까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken().charAt(0));
        }
        System.out.println(sb);
    }
}
