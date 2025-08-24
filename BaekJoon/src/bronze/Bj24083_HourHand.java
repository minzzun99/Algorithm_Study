package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24083_HourHand {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int hour = (A + B) % 12;
        if (hour % 12 == 0) {
            System.out.println(12);
        } else {
            System.out.println(hour);
        }
    }
}
