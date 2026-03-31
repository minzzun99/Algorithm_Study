package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bj31520_ChampernowneVerification {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int start = 1;
        String check = "";
        while (s.length() != check.length()) {
            check += String.valueOf(start);
            if (!s.substring(0, check.length()).equals(check)) {
                System.out.println(-1);
                return;
            }
            start++;
        }

        start--;
        if (check.equals(s)) {
            System.out.println(start);
        } else {
            System.out.println(-1);
        }
    }
}
