package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32710_구구단표 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N <= 9) {
            System.out.println(1);
        } else if (N <= 81) {
            boolean flag = false;
            for (int i = 2; i <= 9; i++) {
                if (i * i > N) {
                    break;
                }

                if (N % i == 0 && N / i <= 9) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? 1 : 0);
        } else {
            System.out.println(0);
        }
    }
}
