package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11966_2의제곱인가 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (true) {
            if (N % 2 != 0) {
                break;
            } else {
                N /= 2;
            }
        }

        if (N == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
