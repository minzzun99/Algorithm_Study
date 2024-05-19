package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1439_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str, "1");
        StringTokenizer st2 = new StringTokenizer(str, "0");
        int count = Math.min(st1.countTokens(), st2.countTokens());
        System.out.println(count);
    }
}
