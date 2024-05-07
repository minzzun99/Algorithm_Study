package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for (char a : str.toCharArray()) {
           sb.append((a - 64)).append(" ");
        }
        System.out.println(sb);
    }
}
