package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj30224_Lucky7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int M = Integer.parseInt(N);
        if (!N.contains("7")) {
            if (M % 7 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            if (M % 7 == 0) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        }
    }
}
