package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17614_369 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 1;
        for (int i = 0; i < N; i++) {
            String s = String.valueOf(num);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
                    count++;
                }
            }
            num++;
        }

        System.out.println(count);
    }
}
