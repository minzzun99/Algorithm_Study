package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17863_FYI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.indexOf("555") == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
