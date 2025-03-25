package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6763_Speed_fines_are_not_fine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        if (speed <= limit) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            int diff = speed - limit;
            if (diff >= 1 && diff <= 20) {
                System.out.println("You are speeding and your fine is $100.");
            } else if (diff >= 21 && diff <= 30) {
                System.out.println("You are speeding and your fine is $270.");
            } else {
                System.out.println("You are speeding and your fine is $500.");
            }
        }
    }
}
