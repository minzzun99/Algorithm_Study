package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj21875_Innohorse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        int x = Math.abs(A.charAt(0) - B.charAt(0));
        int y = Math.abs(A.charAt(1) - B.charAt(1));

        System.out.println(Math.min(x, y) + " " + Math.max(x, y));
    }
}
