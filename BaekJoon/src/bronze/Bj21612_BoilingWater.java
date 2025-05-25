package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj21612_BoilingWater {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine());
        int P = 5 * B - 400;
        System.out.println(P);
        if (B > P) {
            System.out.println(1);
        } else if (B < P) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
