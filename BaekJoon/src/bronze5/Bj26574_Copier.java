package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26574_Copier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int i = Integer.parseInt(br.readLine());
            sb.append(i).append(" ").append(i).append('\n');
        }

        System.out.println(sb);
    }
}
