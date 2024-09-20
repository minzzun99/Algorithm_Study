package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj29699_Welcome_to_SMUPC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) % 14 - 1;
        char[] word = "WelcomeToSMUPC".toCharArray();

        if (N == -1) {
            N = word.length - 1;
        }

        System.out.println(word[N]);
    }
}
