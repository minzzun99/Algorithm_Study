package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5554_심부름가는길 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int secSum = 0;
        for (int i = 0; i < 4; i++) {
            secSum += Integer.parseInt(br.readLine());
        }

        System.out.println(secSum / 60);
        System.out.println(secSum % 60);
    }
}
