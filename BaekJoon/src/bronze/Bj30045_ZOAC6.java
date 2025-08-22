package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj30045_ZOAC6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        while (N-- > 0) {
            String input = br.readLine();
            if (input.contains("01") || input.contains("OI")) {
                result++;
            }
        }
        System.out.println(result);
    }
}
