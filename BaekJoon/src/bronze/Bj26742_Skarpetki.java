package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26742_Skarpetki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int bCount = 0;
        int cCount = 0;
        for (char c : arr) {
            if (c == 'B') {
                bCount++;
            } else {
                cCount++;
            }
        }

        System.out.println((bCount / 2) + (cCount / 2));
    }
}
