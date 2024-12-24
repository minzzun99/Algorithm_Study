package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26209_InterceptingInformation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.contains("9")) {
            System.out.println("F");
        } else {
            System.out.println("S");
        }
    }
}
