package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34161_OO0OO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        br.readLine();
        br.readLine();
        br.readLine();
        sb.append("-1\n".repeat(10000));
        System.out.println(sb);
    }
}
