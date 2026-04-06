package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27257_Любителнулей {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                count--;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
