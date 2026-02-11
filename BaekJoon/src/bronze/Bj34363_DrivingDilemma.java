package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34363_DrivingDilemma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        double D = Double.parseDouble(br.readLine());
        double T = Double.parseDouble(br.readLine());

        double result = S * ((double) 5280 / 3600) * T;
        if (result >= D) {
            System.out.println("MADE IT");
        } else {
            System.out.println("FAILED TEST");
        }
    }
}
