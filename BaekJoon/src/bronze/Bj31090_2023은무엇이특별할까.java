package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31090_2023은무엇이특별할까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int year = (N % 100);
            if (year == 0) {
                sb.append("Bye\n");
            } else if ((N + 1) % year == 0) {
                sb.append("Good\n");
            } else {
                sb.append("Bye\n");
            }
        }
        System.out.println(sb);
    }
}
