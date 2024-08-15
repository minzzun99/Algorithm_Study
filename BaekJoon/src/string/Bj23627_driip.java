package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj23627_driip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        if (length < 5) {
            System.out.println("not cute");
            return;
        }
        str = str.substring(length - 5);
        if (str.equals("driip")) {
            System.out.println("cute");
        } else {
            System.out.println("not cute");
        }
    }
}
