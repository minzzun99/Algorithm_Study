package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25704_출석이벤트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        double total = 0;
        if (N < 5) {
            total = P;
        } else if (N < 10) {
            total = P - 500;
        } else if (N < 15) {
            total = Math.min(P * 0.9, P - 500);
        } else if (N < 20) {
            total = Math.min(Math.min(P * 0.9, P - 500), P - 2000);
        } else {
            total = Math.min(Math.min(P * 0.75, P - 500), P - 2000);
        }

        if (total < 0) {
            total = 0;
        }
        System.out.println((int)total);
    }
}
