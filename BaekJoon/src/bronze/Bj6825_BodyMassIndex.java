package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6825_BodyMassIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double W = Double.parseDouble(br.readLine());
        double H = Double.parseDouble(br.readLine());
        double bmi = W / Math.pow(H, 2);
        if (bmi > 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Underweight");
        }
    }
}
