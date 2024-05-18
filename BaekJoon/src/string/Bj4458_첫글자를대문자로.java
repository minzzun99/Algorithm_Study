package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4458_첫글자를대문자로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String str1 = str.substring(0, 1);
            String str2 = str.substring(1);
            str1 = str1.toUpperCase();
            sb.append(str1).append(str2).append('\n');
        }
        System.out.println(sb);
    }
}
