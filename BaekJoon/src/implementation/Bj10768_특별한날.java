package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10768_특별한날 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        if (M == 2) {
            if (D == 18) {
                System.out.println("Special");
            } else if (D < 18) {
                System.out.println("Before");
            } else {
                System.out.println("After");
            }
        } else if (M > 2) {
            System.out.println("After");
        } else {
            System.out.println("Before");
        }
    }
}
