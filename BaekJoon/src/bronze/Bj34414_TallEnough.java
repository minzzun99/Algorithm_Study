package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34414_TallEnough {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean flag = true;
        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num < 48) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
