package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2857_FBI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            String input = br.readLine();
            if (input.contains("FBI")) {
                sb.append(i).append(" ");
                count++;
            }
        }

        if (count == 0) {
            sb.append("HE GOT AWAY!");
        }
        System.out.println(sb);
    }
}
