package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24568_CupcakeParty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int result = ((R * 8) + (S * 3)) - 28;
        if (result <= 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}
