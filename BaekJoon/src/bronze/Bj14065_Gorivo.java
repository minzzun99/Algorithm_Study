package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14065_Gorivo {
    private static final double MILES = 1.609344;
    private static final double GALLON = 3.785411784;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(br.readLine());
        System.out.println(100 / (MILES / GALLON * x));
    }
}
