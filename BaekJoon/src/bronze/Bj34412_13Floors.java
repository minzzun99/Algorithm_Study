package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34412_13Floors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if (x < 13) {
            System.out.println(x);
        } else {
            System.out.println(x + 1);
        }
    }
}
