package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26489_GumGumForJayJay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }

            if (s.equals("gum gum for jay jay")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
