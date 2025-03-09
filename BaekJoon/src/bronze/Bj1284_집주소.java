package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1284_집주소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String N = br.readLine();
            if (N.equals("0")) {
                break;
            }

            int length = 1;
            for (int i = 0; i < N.length(); i++) {
                if (N.charAt(i) == '1') {
                    length += 3;
                } else if (N.charAt(i) == '0') {
                    length += 5;
                } else {
                    length += 4;
                }
            }
            System.out.println(length);
        }
    }
}
