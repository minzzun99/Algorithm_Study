package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27324_SameNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.charAt(0) == s.charAt(1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
