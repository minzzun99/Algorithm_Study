package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1094_막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = Integer.toBinaryString(Integer.parseInt(br.readLine()));

        int count = 0;
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
