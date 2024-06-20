package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14581_팬들에게둘러싸인홍준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String id = br.readLine();
        sb.append(":fan::fan::fan:").append('\n');
        sb.append(":fan::").append(id).append("::fan:").append('\n');
        sb.append(":fan::fan::fan:");
        System.out.println(sb);
    }
}
