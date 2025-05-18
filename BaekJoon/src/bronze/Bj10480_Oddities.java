package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10480_Oddities {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int input = Integer.parseInt(br.readLine());
            if (input % 2 == 0) {
                sb.append(input).append(" is even\n");
            } else {
                sb.append(input).append(" is odd\n");
            }
        }
        System.out.println(sb);
    }
}
