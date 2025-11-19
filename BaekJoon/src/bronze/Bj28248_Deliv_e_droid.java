package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj28248_Deliv_e_droid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int result = (P * 50) - (C * 10);
        if (P > C) {
            result += 500;
        }
        System.out.println(result);
    }
}
